Report
======

Advanced Scala features great for building DSLs
===============================================

1. Case classes in Scala

Case classes are just like regular classes in Scala except they have the case modifier in front of the class declaration
This 'case' modifier tells the compiler to add certain boiler - plate to the code such as:

* Constructor parameters become public fields(Scala-style, which means that they really just have an associated accessor/mutator method pair)
* Methods toString(), equals() and hashCode() are defined based on the constructor fields
* A companion object containing:
 * An apply() constructor based on the class constructor
 * An extractor based on constructor fields

	case class Person(firstName: String, lastName: String)
 
	val me = Person("Daniel", "Spiewak") // Instantiation of case object
	val first = me.firstName //implicitly created getter is called
	val last = me.lastName
 
	if (me == Person(first, last)) {
  	  println("Found myself!")
  	  println(me)
	}

2. Monads

A Monad is a function amplifier, allows us to compose multiple pure functions with different parameters/return types in a generic fashion. This is ofcourse an oversimplificationof what a monad is. It doesn't take into account the mathematical definition of a Monad.

A monad has three parts:

* A type constructor
* An unit function
* A bind function
