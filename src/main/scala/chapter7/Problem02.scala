package chapter7

package com {
  object Problem02 {
    val someConstant = "Hello"
  }
}

//unclear what the question means
import com._
object TestProblem2 extends App {
  println(Problem02.someConstant)
}
