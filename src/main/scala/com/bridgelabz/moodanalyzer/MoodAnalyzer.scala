package com.bridgelabz.moodanalyzer
class MoodAnalyzerException(exMessage:CustomException.Value ) extends Exception(exMessage.toString){}
class MoodAnalyzer(var message: String) {
  def analyzeMood() = {
    try {
      if (message.length==0){
        throw new MoodAnalyzerException(CustomException.emptyString)
      }
      if(message==null){
        throw new MoodAnalyzerException(CustomException.nullString)
      }
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
    catch {
      case _:NullPointerException=> throw new MoodAnalyzerException(CustomException.nullString)
    }
  }
}