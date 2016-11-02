//Just copy/paste the code into a project.
public class StephenSpeaker {
	public static void main(String[] args) {
		speak("This is a test. :)");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
