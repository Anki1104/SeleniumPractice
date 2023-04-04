package Arrays;

public class ElementFrequency {

	public static void main(String[] args) {
		int age[] = { 10, 29, 10, 40, 49, 49, 29, 10, 10, 10 };
		int fre[] = new int[age.length];
		int visited = -1;
		for (int i = 0; i < age.length; i++) {
			int count = 1;
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] == age[j]) {
					count++;
					fre[j] = visited;
				}
			}
			if (fre[i] != visited) {
				fre[i] = count;
			}
		}
		System.out.println("**************");
		for (int i = 0; i < fre.length; i++) {
			if (fre[i] != visited) {
				System.out.println(age[i] + " : " + fre[i]);
			}
		}
	}
}