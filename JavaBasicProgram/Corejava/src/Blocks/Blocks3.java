package Blocks;

public class Blocks3 {
	Blocks3() {
		System.out.println("zero para");
	}

	Blocks3(int i) {
		System.out.println("int para");
	}

//non static 
	{
		System.out.println("running non static block1 of block3..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() starts");
		Blocks3 b1 = new Blocks3();
		System.out.println("-------");
		Blocks3 b2 = new Blocks3();
		System.out.println("main() ends");
	}

}
