package predefinedclasses.stringclasses;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringclass a1 = new Stringclass();
		System.out.println(a1);//fullyqualifiedclass@hexadecimalnumber
 String s1 = "mumbai";
 String s2 = "mumbai";
 String s3 = "Banglore";
 System.out.println("s1"+ s1);//mumbai
 
 System.out.println("s2"+ s2);//mumbai
 System.out.println("s3"+ s3);//Banglore
 System.out.println("s1 char count is:"+ s1.length());//6
 System.out.println("s2 char count is :" + s2.length());//6
 System.out.println("s3 char count is :"+ s3.length());//8
 System.out.println("s1 and s2 using equall:"+ s1==s2);//false
 System.out.println("s1 and s2 using equals:"+ s1.equals(s2));//true
 System.out.println("s1 and s3 using equals:"+ s1.equals(s3));//false
 System.out.println("s1 and s3 using equals:"+ s1==s3);//false
 String s4 =new String("mumbai");
 System.out.println("s4: " + s4);//mumbai
 System.out.println("s1 and s5 are using equals:" + s4==s1);//false
 System.out.println("s1 and s2 are using equals:"+ s1.equals(s4));//false
 String s5 = new String("Hydrabad");
 System.out.println("s5:"+ s5);
 System.out.println("s1 and s5 are using equals: " + s1.equals(s5));//false
 System.out.println("s1 and s5 are using equals :"+ s1==s5);//false
 String s6 = new String("Mumbai");
 System.out.println("s6:"+s6);
 System.out.println("s1 and s6 are using equals:" + s1.equals(s6));//false
 System.out.println("s1 and s6 are using equals:"+ s1==s6);//false
 
	}

}
