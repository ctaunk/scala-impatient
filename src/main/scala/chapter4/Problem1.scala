package chapter4

object Problem1 extends App {
  val items = Map("Item1" -> 100, "Item2" -> 200)
  val discountedItems = for ((k, v) <- items) yield (k, 0.9 * v)
  println(discountedItems)
}