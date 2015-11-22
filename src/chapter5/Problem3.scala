package chapter5

class Time1(val hours: Int, val minutes: Int) {
  
  if (hours < 0 || hours > 23) {
    throw new IllegalArgumentException("hours cannot be less than 0 or greaer than 23")
  }
  
  if (minutes < 0 || minutes > 59) {
    throw new IllegalArgumentException("minutes cannot be less than 0 or greaer than 59")
  }
  
  def before(other: Time1): Boolean = {
    if (hours < other.hours)
      return true
    else if (hours == other.hours)
      return minutes < other.minutes
    else  
      return false
  }
}