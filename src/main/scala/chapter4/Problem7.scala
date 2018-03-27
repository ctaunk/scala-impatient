package chapter4

import scala.collection.JavaConversions.propertiesAsScalaMap

object Problem7 extends App {
  val props: scala.collection.Map[String, String] = System.getProperties()
  val largest = props.keys.reduceLeft((a, b) => if (a.length > b.length) a else b)
  val len = largest.length + 4
  for((k,v) <- props) println(k + (" " * (len - k.length)) + "| " + v)
}