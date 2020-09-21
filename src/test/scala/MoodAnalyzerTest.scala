import com.bridgelabz.moodanalyzer.MoodAnalyzer
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
  test("givenTestMessage_whenNull_shouldReturnException"){
    val moodAnalyzer = new MoodAnalyzer(null)
    val thrown = intercept[NullPointerException]{
      moodAnalyzer.analyzeMood()
    }
    assert( thrown.getMessage === "HAPPY")
  }
}
