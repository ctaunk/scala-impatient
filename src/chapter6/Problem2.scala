package chapter6

abstract class UnitConversion {
    def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double): Double = value * 3.7854
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double): Double = value * 1.609
}

object TestConversions extends App {
  println("5.5 in = " + InchesToCentimeters.convert(5.5) + " cm")
  println("2.2 gallons = " + GallonsToLiters.convert(2.2) + " liters")
  println("1.8 miles = " + MilesToKilometers.convert(1.8) + " km")
}
