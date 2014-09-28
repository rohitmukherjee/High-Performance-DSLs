package jsonDSL

import scala.collection.mutable.HashMap
import scala.collection.mutable.MutableList

case class KeyValuePair(key: String, value: Any)

object JSON {
	var data = Map[String, Any]()

	// Defining the syntactic sugar here for the json dsl
	def %(key: String, value: Any) = addPair(key, value)

	def ::(items: MutableList[Map[String, Any]], item:Map[String, Any]) = addToList(items, item)

	def ->(key: String, value: Any) = Map(key -> value)

	def addPair(key: String, value: Any): Map[String, Any] = {
		data += (key -> value)
		data
	}

	def addToList(items: MutableList[Map[String, Any]], item: Map[String, Any]) =
	{
	 if (items.contains(item.keySet))
	   items
	 items += item
	 items
	}

	def print(data: Map[String, Any]): Unit = {
		data.foreach(println(_))
	}

	def print(data: MutableList[Map[String, Any]]): Unit = {
	  data.foreach(print _)
	}

	def jsonClient(args: Array[String]): Unit = {
		val json = addPair("Hello", ('I','A','M','G','O','O','D'))
		var list = addToList(MutableList(json), Map("car" -> "honda"))
		list = addToList(list, Map("car" -> "mercedes"))
		print(list)

		println("Using Syntactic Sugar")
		println("*********************")

		// Using new sugar
		val json2 =  ::(::(
		    MutableList(
		        %("hello", "hello")),
		        ->("car", "honda")),
		        ->("car2","mercedes"))
		    print(json2)


}
}

