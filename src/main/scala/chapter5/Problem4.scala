package chapter5

class Time2(val hours: Int, val minutes: Int) {
  
  if (hours < 0 || hours > 23) {
    throw new IllegalArgumentException("hours cannot be less than 0 or greaer than 23")
  }
  
  if (minutes < 0 || minutes > 59) {
    throw new IllegalArgumentException("minutes cannot be less than 0 or greaer than 59")
  }
  
  private val minsAfterMidnight = hours * 60 + minutes
  
  def before(other: Time2): Boolean = {
    return minsAfterMidnight < other.minsAfterMidnight
  }
}