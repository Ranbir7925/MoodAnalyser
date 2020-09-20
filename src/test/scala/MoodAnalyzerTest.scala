import com.bridgelabz.moodanalyzer.MoodAnalyzer
import org.scalatest.FunSuite

class MoodAnalyzerTest extends FunSuite{
  test("Check sad mood"){
    assert(MoodAnalyzer.analyzeMood("I am in Sad Mood") === "SAD")
  }
  test("Check Happy mood"){
    assert(MoodAnalyzer.analyzeMood("I am in Happy Mood") == "HAPPY")
  }
}
