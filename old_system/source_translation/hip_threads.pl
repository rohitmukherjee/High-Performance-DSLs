"hip_threads"=>
    ["threads/motiv-example.ss",3,  "--en-para --en-thrd-resource -tp redlog", "main","SUCCESS","thread1","SUCCESS","thread2","SUCCESS"],
    ["threads/motiv-example2.ss",3,  "--en-para --en-thrd-resource -tp redlog", "main","SUCCESS","thread1","SUCCESS","thread2","SUCCESS"],
    ["threads/no-deadlock-nonlexical2.ss",3,  "--en-para --en-thrd-resource -tp parahip --en-lsmu-infer","main","SUCCESS","thread1","SUCCESS","thread2","SUCCESS"],
    ["threads/no-deadlock-nonlexical.ss",3,  "--en-para --en-thrd-resource -tp parahip --en-lsmu-infer","main","SUCCESS","thread1","SUCCESS","thread2","SUCCESS"],
    ["threads/forkjoin.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/cell4.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "inc","SUCCESS","main","SUCCESS"],
    ["threads/ls-bind.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/no-deadlock1.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/no-deadlock2.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/no-deadlock3.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/deadlock1.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","FAIL"],
    ["threads/deadlock2.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","FAIL"],
    ["threads/deadlock3.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","FAIL"],
    ["threads/disj-no-deadlock1.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/disj-no-deadlock2.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/disj-no-deadlock3.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/disj-deadlock.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","FAIL"],
    ["threads/ordered-locking.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","SUCCESS","main","SUCCESS"],
    ["threads/unordered-locking.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "func","FAIL","main","SUCCESS"],
    ["threads/oracle.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "thread","SUCCESS","main","SUCCESS"],
    ["threads/owicki-gries.ss",3,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "incrementor2","SUCCESS","incrementor1","SUCCESS","main","SUCCESS"],
    ["threads/fibonacci.ss",2,  "--en-para -tp parahip --en-lsmu-infer --en-thrd-resource", "seq_fib","SUCCESS","para_fib","SUCCESS"],