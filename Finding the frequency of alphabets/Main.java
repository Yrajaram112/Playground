import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
       str=str.toLowerCase();
       StringBuilder st = new StringBuilder(str);
      int len = str.length();
      for(int i =0;i<len;i++)
      {
        int val = 1;
        if (st.charAt(i)!='$'){
        System.out.print(st.charAt(i));
        for (int j =i+1;j<len;j++)
        { if (st.charAt(j)!='$')
        {
          if (st.charAt(i)==st.charAt(j))
          { 
            st.setCharAt(j,'$');
            val++;
          }
            
        }
        }
        System.out.print(val);
        System.out.print(" ");}
      }
    }
}