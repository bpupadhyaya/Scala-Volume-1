package com.equalinformation.scala.vol.one.scala_fundamentals.problems

/**
  * Created by bpupadhyaya on 5/7/17.
  */
import scala.io.StdIn._

object StringConcat {
  def main(args: Array[String]): Unit = {
    print("Please enter the first word: ")
    val firstWord = readLine()
    print("Please enter the second word: ")
    val secondWord = readLine()
    val combination = firstWord.toString.concat(secondWord.toString)
    println(combination)
    val wordCombreversed = combination.reverse
    println(wordCombreversed)
  }
}
