package Blocks;

public class Blocks2 {
	static {
		System.out.println("running static block1 of class block2");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		// TODO Auto-generated method stub
		System.out.println("i am main() of block class");
		System.out.println("main () ends here");
	}

	static {
		System.out.println("hiee ruuning block 2 of class block 2");
	}
}
