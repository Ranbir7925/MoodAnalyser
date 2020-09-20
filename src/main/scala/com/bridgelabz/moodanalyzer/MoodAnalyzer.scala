package com.bridgelabz.moodanalyzer

object MoodAnalyzer {
  def analyzeMood(moodMessage: String) = {
    if (moodMessage.contains("Sad"))
      "SAD"
    else
      "HAPPY"
  }
}
