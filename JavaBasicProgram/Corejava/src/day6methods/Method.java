package day6methods;

public class Method {

		// static global variables
		static int age;
		static double salary;

		/**
		 * Method type: static 
		 * Access Modifier: public 
		 * non-access Modifier: static 
		 * return type:int	
		 * method name: age, salary
		 * argument: NA
		 * return value: NA
		 */
		public static int test1() {
			System.out.println("I am test1 method.");
			// logic
			 int pin=201201;
			 return pin;
			//return 201201;
		}

		/**
		 * Method type: static
		 * Access Modifier:public 
		 * non-access Modifier: static
		 * return type:int	
		 * method name: test1
		 * argument: NA
		 * return value: 201201
		 */
		static void test2() {
			System.out.println("I am test2 method");
			// return; this will be written by java compiler at compile
		}

		/**
		 * Method type: static 
		 * Access Modifier: default
		 * non-access Modifier: static
		 * return type:void 	
		 * method name:test2 
		 * argument: NA
		 * return value:default
		 */
		static double test3(boolean b1) {
			System.out.println("");
			return 15.36;
		}
		/**
		 * Method type: static 
		 * Access Modifier:default
		 * non-access Modifier: static
		 * return type: double	
		 * method name: test3
		 * argument:boolean
		 * return value: 15.36
		 */	
		static private void test4(float f) {
			System.out.println("");
		}
		/**
		 * Method type: static
		 * Access Modifier: private
		 * non-access Modifier: static
		 * return type:void
		 * method name: test4
		 * argument: float
		 * return value: default
		 */
		}

	
		// TODO Auto-generated method stub

	


