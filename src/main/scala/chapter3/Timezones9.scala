package chapter3

object Timezones9 {

  def timezones(): Array[String] = {
    val tz = java.util.TimeZone.getAvailableIDs()
    tz.filter( _ startsWith("America/")).map( _ drop("America/".length)).sorted
  }

  def main(args: Array[String]): Unit = {
    println(timezones().mkString(","))
  }

}
