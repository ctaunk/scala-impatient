package chapter4

object Problem4 extends App {
  val in =  new java.util.Scanner(getClass().getResourceAsStream("file.txt"))
  var counts = scala.collection.immutable.SortedMap[String, Int]()
  while (in.hasNext()) {
    val word = in.next().toLowerCase()
    counts = counts + (word -> (counts.getOrElse(word, 0) + 1))
  }
  println(counts)
}