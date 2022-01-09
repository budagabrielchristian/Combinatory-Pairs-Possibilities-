import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList A = new LinkedList<>();
		LinkedList B = new LinkedList<>();
		for(int i = 1; i<=3; i++) {
			A.add("examplePerson"+i);
		}
		for(int j = 1; j<=5; j++) {
			B.add("assigningBook"+j);
		}
		PossibleCombinations pc = new PossibleCombinations(A, B);
		pc.findCombinations();
	}
}
