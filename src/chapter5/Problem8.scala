package chapter5

class Car(val manufacturer: String, val model: String) {
  private var modelYear: Int = -1
  var license: String = ""

  def this(manufacturer: String, model: String, year: Int) {
    this(manufacturer, model)
    this.modelYear = year
  }

  def this(manufacturer: String, model: String, license: String) {
    this(manufacturer, model)
    this.license = license
  }

  def this(manufacturer: String, model: String, year: Int, license: String) {
    this(manufacturer, model)
    this.modelYear = year
    this.license = license
  }
  
  def year = modelYear
  
}