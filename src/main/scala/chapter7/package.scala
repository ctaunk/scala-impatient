package object random {
  private[random] var previous: Int = 1

  def setSeed(seedVal: Int): Unit = {
    previous = seedVal
  }

  def nextInt(): Int = {
    previous = previous * 1664525 + 1013904223 % (2 ^ 32)
    previous
  }

}

object TestRandom extends App {
  random.setSeed(5)
  //println(random.nextDouble())
  //println(random.nextDouble())
  println(random.nextInt())
  println(random.nextInt())
  println(random.nextInt())
  println(random.nextInt())
}
