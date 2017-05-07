package com.equalinformation.scala.vol.one.introduction

import scala.io.StdIn._

/**
  * Created by bpupadhyaya on 4/12/17.
  */
object AddTwoIntegers {
  def main(arguments: Array[String]): Unit = {
    print("Enter the first integer: ")
    val firstNumber = readInt()
    print("Enter the second integer: ")
    val secondNumber = readInt()
    val sum = firstNumber + secondNumber
    println("The sum is "+sum)

  }
}
