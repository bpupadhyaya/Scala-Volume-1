package com.equalinformation.scala.vol.one.scala_fundamentals.problems

/**
  * Created by bpupadhyaya on 5/7/17.
  */
import scala.io.StdIn._

object AreaCalculation {
  def main(args: Array[String]): Unit = {
    val area = {
      print("Please enter the length: ")
      val length = readDouble()
      print("Please enter the breadth: ")
      val breadth = readDouble()
      length * breadth
    }
    println(area)
  }
}
