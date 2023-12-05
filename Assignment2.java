1) import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
      System.out.println("Given first length: ");
	double x = sc.nextDouble();

	System.out.println("Given second length: ");
	double y = sc.nextDouble();
   
     
       double hypotenuse = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
       System.out.println("Length of the hypotenuse: " + hypotenuse);
	
}
       	
}
...........................................................................................................................................

3) import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	double a = 5;
        double b = 2;
	System. out. println(Math. pow(a, b));
	
}
       	
}
..........................................................................................................................................
4) import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a five-digit number");

int n = sc.nextInt();

int d5=n%10;

int d4=n/10%10;

int d3=n/100%10;

int d2=n/1000%10;

int d1=n/10000%10;

int S=d1+d4;

System.out.println("Print sum:"+S);
}
       	
}
.........................................................................................................................................
5) import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	 double principal = 8500, rate = 0.3, time = 5; 
  	
	double A = principal * (Math.pow((1 + rate / 100), time)); 
		 double CI = A - principal; 
          
        System.out.println("Compound Interest is "+ CI); 

	
}
       	
}
..........................................................................................................................................
2) import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int firstNo , secondNo;
	char operator;
	System.out.print("Enter 1st number : ");
	firstNo = sc.nextInt();

	System.out.print("Enter 2nd number : ");
	secondNo = sc.nextInt();

	System.out.print("Enter operation (+,-,/,*) : ");
	operator = sc.next().charAt(0);
	if (operator=='+'){
	
	System.out.print("Result : "+ firstNo + operator + secondNo + " = " +(firstNo + secondNo)); }

	if (operator=='-'){
	
	System.out.print("Result : "+ firstNo + operator + secondNo + " = " +(firstNo - secondNo)); }

	if (operator=='*'){
	
	System.out.print("Result : "+ firstNo + operator + secondNo + " = " +(firstNo * secondNo)); }

	if (operator=='/'){
	
	System.out.print("Result : "+ firstNo + operator + secondNo + " = " +(firstNo / secondNo)); }
	 
		
}
       	
}




































