package com.bridgelabz.moodanalyzer

object CustomException extends Enumeration {
  type CustomException = Value
  val nullString =Value("Message can't be null")
  val emptyString =Value("Message length must be greater then zero")
}
