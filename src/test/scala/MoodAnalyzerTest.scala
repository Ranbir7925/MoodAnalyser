import com.bridgelabz.moodanalyzer.MoodAnalyzer1
import org.scalatest.FunSuite

class MoodAnalyzerTest extends FunSuite{
  test("Check sad mood"){
    var moodAnalyzer = new MoodAnalyzer1("I am in Sad Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "SAD")
  }
  test("Check Happy mood"){
    var moodAnalyzer = new MoodAnalyzer1("I am in Happy Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood()==="HAPPY")
  }
  test("Check for any mood"){
    var moodAnalyzer = new MoodAnalyzer1("I am in Any Mood")
    assert(moodAnalyzer.MoodAnalyzer.analyzeMood() === "HAPPY")
  }
}
