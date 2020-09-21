package com.bridgelabz.moodanalyzer

class MoodAnalyzer(var message: String) {
  def analyzeMood() = {
    try {
      if (message==null){
        throw new NullPointerException("HAPPY")
      }
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
    catch {
      case e:NullPointerException => throw e
    }
  }
}