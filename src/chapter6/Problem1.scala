package chapter6

object Problem1 extends App {

  def inchesToCentimeters(inches: Double): Double = {
    inches * 2.54
  }

  def gallonsToLiters(gallons: Double): Double = {
    gallons * 3.7854
  }

  def milesToKilometers(miles: Double): Double = {
    miles * 1.609
  }

  println("5.5 in = " + inchesToCentimeters(5.5) + " cm")
  println("2.2 gallons = " + gallonsToLiters(2.2) + " liters")
  println("1.8 miles = " + milesToKilometers(1.8) + " km")
}
