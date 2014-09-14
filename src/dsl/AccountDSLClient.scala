package dsl

class AccountDSLClient {

  // We define an implicit which can do the conversion from Java Account -> Scala AccountDSL
  implicit def enrichAccount(account: Account): AccountDSL = new AccountDSL(account)

  def main(arguments: Array[String]) = {
    val threshold = 100
    val acc1 = new Account("acc-1", "David P.")
    val acc2 = new Account("acc-2", "John S.")
    val acc3 = new Account("acc-3", "Fried T.")
    
    // #1: First usage of DSL using Scala idioms
    acc1.addName("Mary R.").addName("Shawn P.").addName("John S.")
    val accounts = List(acc1, acc2, acc3)
    accounts filter (_ belongsTo "John S.") map (_ getFirstName) foreach (println)
    
    // #2: Second usage of DSL using Scala idioms
    accounts.filter(_ belongsTo "John S.")
	.map(_.calculate(new CalculatorImplementation))
	.filter(_ > threshold)
	.foldLeft(0.0)(_ + _)
	
	// #3: Closer to domain and further away from Scala idioms
	val account = new Account("acc-4", "Lloyd B")
    account.AccountDSL.withAccount(new Trade)(println)
  }
}