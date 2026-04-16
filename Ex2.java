import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arithmetic Operators

        // int a=10;
        // int b=20;
        // int c=a+b;
        // int d=a-b;
        // int e=a*b;
        // int f=b/a;
        // int g=a%b;
        // System.out.println("The answer is: " + c);
        // System.out.println(d);
        // System.out.println(e+" "+f);
        // System.out.println(g);

        //Relational Operators

        // int a=10;
        // int b=20;
        // System.out.println(a<b);
        // System.out.println(a>b);
        // System.out.println(a<=b);   
        // System.out.println(a>=b);
        // System.out.println(a==b);
        // System.out.println(a!=b);

        // Logical Operators

        // int a=10;
        // int b=20;
        // System.out.println(a<b && a>5);
        // System.out.println(a>b || a>5);
        // System.out.println(!(a<b));

        // Assignment Operators

        // int a=10;
        // int b=a+=5;
        // int c=a-=5;
        // int d=a*=5;
        // int e=a/=5;
        // int f=a%=5;
        
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f);


        //Age Calculator
        // System.out.print("Enter your birth year: ");
        // int a = sc.nextInt();
        // System.out.print("Enter current year: ");
        // int b = sc.nextInt();
        // int age=b-a;
        // System.out.println("Your age is: " + age);

        //Odd or Even
        
        // int num;
        // System.out.print("Enter a number: ");
        // num = sc.nextInt();
        // if(num % 2 == 0) {
        //     System.out.println(num + " is an even number.");
        // } 
        // else {
        //     System.out.println(num + " is an odd number.");
        // }

        //Largest of three numbers
        // int num1, num2, num3;
        // System.out.print("Enter three numbers: ");  
        // num1 = sc.nextInt();
        // num2 = sc.nextInt();
        // num3 = sc.nextInt();

        // if(num1 >= num2 && num1 >= num3) {
        //     System.out.println(num1 + " is the largest number.");
        // } 
        // else if(num2 >= num1 && num2 >= num3) {
        //     System.out.println(num2 + " is the largest number.");
        // } 
        // else {
        //     System.out.println(num3 + " is the largest number.");
        // }

    // Sum of n numbers
    int a = 0;
    for (int i=1;i<=1000;i++){
        System.out.println(i);
        a=a+i;
    }
    System.out.println("The sum of first 1000 numbers is: " + a);
}
}