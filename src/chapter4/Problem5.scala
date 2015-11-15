package chapter4

import scala.collection.JavaConversions.mapAsScalaMap

object Problem5 extends App {
  val in =  new java.util.Scanner(getClass().getResourceAsStream("file.txt"))
  val counts: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
  while (in.hasNext()) {
    val word = in.next().toLowerCase()
    counts(word) = counts.getOrElse(word, 0) + 1
  }
  println(counts)
}