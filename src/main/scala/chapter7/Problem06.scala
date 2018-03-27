package chapter7

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable.{HashMap => ScalaHashMap}

object Problem06 extends App {

  val javaHashMap = new JavaHashMap[String, String]()
  javaHashMap.put( "1", "A")
  javaHashMap.put( "2", "B")
  val scalaHashMap = new ScalaHashMap[String, String]()
  //could've used scala.collection.JavaConversions.mapAsJavaMap also
  val iterator = javaHashMap.entrySet().iterator()
  while (iterator.hasNext) {
    val entry = iterator.next()
    scalaHashMap += entry.getKey -> entry.getValue
  }
  println(scalaHashMap)
}
