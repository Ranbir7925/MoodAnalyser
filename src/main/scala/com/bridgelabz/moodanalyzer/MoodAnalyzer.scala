package com.bridgelabz.moodanalyzer

class MoodAnalyzer1 (var message:String) {

  object MoodAnalyzer {
    def analyzeMood() = {
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
  }
}
