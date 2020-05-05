import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      if (n1>=85)
        System.out.println('A');
      else if (n1>=75)
        System.out.println('B');
      else if (n1>=65)
        System.out.println('C');
      else if (n1>=55)
        System.out.println('D');
      else if (n1>=45)
        System.out.println('E');
      else if (n1<45)
        System.out.println("Fail");
    }
}