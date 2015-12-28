package chapter8

import scala.collection.mutable

abstract class Item {
  def price: Double

  def description: String
}

class SimpleItem(prc: Double, descr: String) extends Item {
  override val price = prc
  override val description = descr
}

class Bundle(descr: String) extends Item {

  private val items = new mutable.MutableList[Item]()

  override def price: Double = items.foldLeft(0.0)((total, item2) => total + item2.price)
  override val description = descr
  def addItem(item: Item) = items += item
}

object Problem4 {

  def main(args: Array[String]) {
    val item1 = new SimpleItem(2, "Simple item 1")
    val item2 = new SimpleItem(3, "Simple item 2")
    val bundle = new Bundle("A bundled item")
    bundle.addItem(item1)
    bundle.addItem(item2)
    println(bundle.description)
    println(bundle.price)
  }
}
