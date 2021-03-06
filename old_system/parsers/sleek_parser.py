INPUT_FILE_NAME = "text_input"
OUTPUT_FILE_NAME = "DSL.scala"
KEY_IDENTIFIER = "=>"
OUTPUT_DIRECTORY = "results"
INPUT_DIRECTORY = "/home/rohit/hg/sleek_hip/examples/working/sleek/"
COMMENT = "#"
USAGE_TEMPLATE = "Usage.template"
NEW_LINE = '\n'

''' 
Examples:

Input
-----

["label-basic.slk", "--dis-eps", (), "Fail.Valid.Valid.Fail."],

DSL output:
----------
new SleekTestCaseBuilder runCommand "sleek" onFile 
"/home/rohit/hg/sleek_hip/examples/working/sleek/sleek9.slk" 
withArguments "--elp" storeOutputInDirectory "results" withOutputFileName "sleek9.out" checkAgainst "Valid, Fail, Valid, Valid"

'''

# Function reads in the original script which follows example format above (read-fast-tests.pl)
def read_script():
	global script
	with open(INPUT_FILE_NAME) as f:
		script = f.readlines()

def read_template(template_name):
	with open(template_name) as f:
		pre = f.readlines()
	template_data = ''
	for line in pre:
		template_data  += line + NEW_LINE
	return template_data

def process_script():
	global output_contents
	template_data = read_template(USAGE_TEMPLATE)
	script_string = ''
	for line in script:
		script_string += process_line(line) + NEW_LINE
	injected_template = template_data.replace("##", script_string)
	print(injected_template)

def sanitise_input(word):
	return word.strip("[").strip("]").replace('"', '')

def sanitise_file_name(file_name):
	return file_name.replace("/", "_").replace("-","_")

def wrap_quotes(word):
	return '"' + word + '"'

def parse_expected_output(expected_output):
	expected_output = expected_output.replace(".", ", ")
	return expected_output[0:len(expected_output) - 2].lstrip().rstrip()

def construct_sleek_test(file_name, arguments, expected_output):
	output_file = sanitise_file_name(file_name).replace(".slk", ".out")
	test_name = sanitise_file_name(file_name).replace(".slk", "Test")
	test = "val " + test_name + " = " + NEW_LINE
	test += 'new SleekTestCaseBuilder runCommand "sleek" onFile ' + wrap_quotes(INPUT_DIRECTORY + file_name) + ' withArguments ' + wrap_quotes(arguments) + ' storeOutputInDirectory ' + wrap_quotes(OUTPUT_DIRECTORY) + ' withOutputFileName ' + wrap_quotes(output_file) + ' checkAgainst ' + wrap_quotes(expected_output) + '\n'
	test += test_name + ".build " + "generateOutput()" + NEW_LINE
	test += NEW_LINE
	return test

def construct_sleek_test_suite(file_name, arguments, expected_output):
	output_file = sanitise_file_name(file_name).replace(".slk", ".out")
	builder_test = "suite addTest(" + wrap_quotes("sleek") + "," + wrap_quotes(INPUT_DIRECTORY + file_name) + "," + wrap_quotes(arguments) + "," + wrap_quotes(OUTPUT_DIRECTORY) + "," + wrap_quotes(output_file) + "," + wrap_quotes(expected_output) + ")" + NEW_LINE
	return builder_test

def construct_regression_test(file_name, arguments):
	return ""

def construct_regression_test_suite(file_name, arguments):
	return ""

def process_line(line):
	line = line.strip()
	test = ''
	if(KEY_IDENTIFIER not in line and COMMENT not in line and len(line) > 2):
		components = line.split(',')
		file_name = sanitise_input(components[0])
		arguments = sanitise_input(components[1])
		expected_output = parse_expected_output(sanitise_input(components[3]))
		test = construct_sleek_test_suite(file_name, arguments, expected_output)
	return test

read_script()
process_script()