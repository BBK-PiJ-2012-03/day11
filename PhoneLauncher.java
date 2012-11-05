public class PhoneLauncher {
	public static void main(String[] args) {
	PhoneLauncher launcher = new PhoneLauncher();
	launcher.launch();
	}
	
	public void launch() {
	SmartPhone myMobile = new SmartPhone("nokia");
	System.out.println(myMobile.getBrand());
	myMobile.call("01");
	myMobile.call("02");
	myMobile.call("03");
	myMobile.call("04");
	myMobile.call("05");
	myMobile.call("06");
	myMobile.call("07");
	myMobile.call("08");
	myMobile.call("09");
	myMobile.call("00446925125325");
	myMobile.call("10");
	myMobile.call("11");
	myMobile.call("12");
	
	myMobile.ringAlarm("beeeeeeeeeeep");
	myMobile.playGame("tetris");
	myMobile.printLastNumbers();
	myMobile.browseWeb("google");
	System.out.println(myMobile.findPosition());
	}

	
}