import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      str = str.toLowerCase();
      StringBuilder st = new StringBuilder(str);
      StringBuilder st1 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
      int val = st.length();
      int val1 = st1.length();
      for (int i = 0;i<val;i++)
      {
        for (int j=0;j<val1;j++)
        {
          if (st.charAt(i)==st1.charAt(j))
            st1.setCharAt(j,'$');
            
        }
      }
      for (int i=0;i<val1;i++)
      {if (st1.charAt(i)!='$')
      System.out.print(st1.charAt(i)+" ");}
      
    }
}