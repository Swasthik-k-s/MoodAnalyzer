
public class MoodAnalyzer {
	String message;

	public enum errors {
		EMPTY_MOOD_ERROR,NULL_MOOD_ERROR
	}

	public MoodAnalyzer() {
		this.message = null;
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyzerException {

		if (message == null) {

			throw new MoodAnalyzerException(errors.NULL_MOOD_ERROR.toString());
		}
		if (message.length() == 0) {
			throw new MoodAnalyzerException(errors.EMPTY_MOOD_ERROR.toString());
		}

		if (message.contains("sad")) {
			return "SAD";
		}
		else {
		return "HAPPY";
		}
	}
}
