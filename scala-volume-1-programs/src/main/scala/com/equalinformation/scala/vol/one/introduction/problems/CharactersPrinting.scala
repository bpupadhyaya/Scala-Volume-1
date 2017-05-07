package com.equalinformation.scala.vol.one.introduction.problems

/**
  * Created by bpupadhyaya on 4/13/17.
  */
object CharactersPrinting {
  def main(args: Array[String]): Unit = {
    print("Please enter a string: ")
    val inputString = scala.io.StdIn.readLine()
    inputString.toString.foreach(println)
  }
}
