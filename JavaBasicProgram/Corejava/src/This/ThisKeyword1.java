package This;

class student {
	int rollno;
	float fees;;

	student(int rollno, float fees) {
		rollno = rollno;
		fees = fees;
	}

	void display() {
		System.out.println(rollno + "  " + fees);
	}
}
public class ThisKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(111, 2000f);
		s1.display();
		student s2 = new student(200, 5000f);
		s2.display();
	}

}
