public class LectureScript {
	public static void main(String[] args) {
		LectureScript script = new LectureScript();
		script.launch();
	}	
	
	public void launch() {
		Lecturer mylect = new Lecturer("Mr Adams");
		mylect.teach("History");
		mylect.doResearch("Ancienct History");
	}
}	