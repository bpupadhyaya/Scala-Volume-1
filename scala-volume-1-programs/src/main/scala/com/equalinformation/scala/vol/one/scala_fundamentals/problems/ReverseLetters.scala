package com.equalinformation.scala.vol.one.scala_fundamentals.problems

/**
  * Created by bpupadhyaya on 5/7/17.
  */
object ReverseLetters {
  def main(args: Array[String]) {
    print("Please enter a word: ")
    val word = scala.io.StdIn.readLine();
    val wordReversed = word.toString.reverse
    println(wordReversed)
  }
}
