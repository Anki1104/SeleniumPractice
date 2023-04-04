package Constructor;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("zero parameterized constructor");
	}
	ConstructorOverloading(int a, double b){
		System.out.println("int double para constructor");
	}
	ConstructorOverloading(int a, int b){
		System.out.println("int int para constructor");
	}
	ConstructorOverloading(double p, int  r, int a){
		System.out.println("double int int para constructor");
	}
	ConstructorOverloading(int r, char t, int h ){
		System.out.println("int char int para constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(11, 11.12);
		ConstructorOverloading c3 = new ConstructorOverloading(04,26);
		ConstructorOverloading c4 = new ConstructorOverloading(11.04, 2, 10);
		ConstructorOverloading c5 = new ConstructorOverloading(143, 'P',88);
	}

}
