package chapter5

class Counter {
  
  private var value = 0
  
  //question is not clear on how to handle it
  //so resetting to 0 when Int.MaxValue is reached
  def increment() {
    if (value == Int.MaxValue)
      value = 0
    else 
      value += 1 
  }
  def current = value
  
}


object Counter extends App {
  val counter = new Counter()
  while (counter.current < Int.MaxValue) {
    counter.increment()
  }
  println(counter.current)
  counter.increment()
  println(counter.current)
  counter.increment()
  println(counter.current)
}