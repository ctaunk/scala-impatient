package chapter6

object Problem5 extends App {
  for (i <- args.length until (0, -1)) println(args(i-1))
}