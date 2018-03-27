package com
package horstmann {

object Utils {
  val someConstant = "Hello"
}

object TestProblem1a extends App {
  println(Utils.someConstant)
}
package impatient {}

}

package com.horstmann.impatient {

object TestProblem1b extends App {
  //compile error; Utils not in scope
  //println(Utils.someConstant)
}

}
