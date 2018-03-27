package chapter5

object TestProblem8 extends App {
  var car = new Car("Ford", "Mustang")
  println(car.manufacturer + " " + car.model + " " + car.year + " " + car.license)
  car.license = "ABC 123"
  println(car.manufacturer + " " + car.model + " " + car.year + " " + car.license)
  car = new Car("Ford", "Mustang", 2015)
  println(car.manufacturer + " " + car.model + " " + car.year + " " + car.license)
  car = new Car("Ford", "Mustang", "ABC 123")
  println(car.manufacturer + " " + car.model + " " + car.year + " " + car.license)
  car = new Car("Ford", "Mustang", 2015, "ABC 123")
  println(car.manufacturer + " " + car.model + " " + car.year + " " + car.license)
}