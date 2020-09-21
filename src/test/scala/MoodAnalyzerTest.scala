import com.bridgelabz.moodanalyzer.{CustomException, MoodAnalyzer, MoodAnalyzerException}
import org.scalatest.FunSuite

class MoodAnalyzerTest extends FunSuite {
  test("givenTestMessage_whenWithSadMood_shouldReturnSad") {
    val moodAnalyzer = new MoodAnalyzer("I am in Sad Mood")
    assert(moodAnalyzer.analyzeMood() == "SAD")
  }
  test("givenTestMessage_whenWithHappyMood_shouldReturnHappy") {
    val moodAnalyzer = new MoodAnalyzer("I am in Happy Mood")
    assert(moodAnalyzer.analyzeMood() == "HAPPY")
  }
  test("givenTestMessage_whenWithAnyMood_shouldReturnHappy") {
    val moodAnalyzer = new MoodAnalyzer("I am in Any Mood")
    assert(moodAnalyzer.analyzeMood() === "HAPPY")
  }
  test("givenTestMessage_whenNull_shouldReturnCustomException"){
    val moodAnalyzer = new MoodAnalyzer(null)
    val thrown = intercept[MoodAnalyzerException]{
      moodAnalyzer.analyzeMood()
    }
    assert( thrown.getMessage == CustomException.nullString.toString)
  }
  test("givenTestMessage_whenEmptyString_shouldReturnCustomException"){
    val moodAnalyzer = new MoodAnalyzer("")
    val thrown = intercept[MoodAnalyzerException]{
      moodAnalyzer.analyzeMood()
    }
    assert(thrown.getMessage == CustomException.emptyString.toString)
  }
}
