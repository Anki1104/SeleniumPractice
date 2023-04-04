package basic;

public class NonStaticLocalGlobal 	{
int empId = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticLocalGlobal n1 = new NonStaticLocalGlobal();
		n1.display();
	}
		void display() {
			int empId = 45;
			System.out.println(empId);
			System.out.println(empId);
		}

	}


