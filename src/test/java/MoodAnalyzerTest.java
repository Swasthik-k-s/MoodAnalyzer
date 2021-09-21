import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	
	@Test
	public void testSad() {
		try {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyzerException e) {
			System.out.println(e);
		}
	}

	@Test
	public void testHappy() {
		try {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyzerException e) {
			System.out.println(e);
		}

	}

	@Test
	public void testForNullValue_getsException() {
		try {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer();
			moodAnalyser.analyseMood();
		} catch (MoodAnalyzerException e) {
			System.out.println(e);
		}
	}

	@Test
	public void testForEmptyMood_getsException() {
		try {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
			moodAnalyser.analyseMood();
		} catch (MoodAnalyzerException e) {
			System.out.println(e);
		}

	}
}
