
public class VirtualClass {
	public void teach() {
		System.out.println("The class is taught by an instructor");
	}
}
class MathClass extends VirtualClass {
	public void teach() {
		System.out.println("The instructor: starts with a video  explaining the topic of the day. Then the instructor goes through a set of problems.");
	}
}
class PhilosophyClass extends VirtualClass {
	public void teach() {
		System.out.println("The instructor: gives an audio only experience followed by a recorded discussion between students.");
	}
}
class EnglishClass extends VirtualClass {
	public void teach() {
		System.out.println("The instructor: corrects the exercises, homeworks and then gives a lecture.");
	}
}
class HistoryClass extends VirtualClass {
	public void teach() {
		System.out.println("The instructor: asks students if they have any questions about the last class and then goes through the current events in the country.");
	}
}
class Main {
	public static void main(String[] args) {

		VirtualClass myVirtualClass = new VirtualClass();  				// Creates a Virtual class object
		VirtualClass myMathClass = new MathClass();  					// Create a Math class object
		VirtualClass myPhilosophyClass = new PhilosophyClass(); 		// Create a Philosophy class object  
		VirtualClass myEnglishClass = new EnglishClass(); 			 	// Create an English class object
		VirtualClass myHistoryClass = new HistoryClass(); 		 		// Create an History class object
		myVirtualClass.teach();
		myMathClass.teach();
		myPhilosophyClass.teach();
		myEnglishClass.teach();
		myHistoryClass.teach();
	}
}
