package This;
	 class Student1{
		int rollno;
		float fee;

		Student1(int rollno, float fee) {
			rollno = rollno;
			fee = fee;
		}

		void display() {
			System.out.println(rollno + " " + fee);
		}
	}

	 class ThisKeyword2 {
		public static void main(String args[]) {
			Student1 s1 = new Student1(189, 5000f);
			s1.display();//
			Student1 s2 = new Student1(167, 6000f);
			s2.display();//
		}
	}
