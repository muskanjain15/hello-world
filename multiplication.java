import java.util.Scanner;
public class multiplication
{
  public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
   System.out.print("enter a number");
   int n;
   n=s.nextInt();
   for(int i=1;i<=10;i++)
      {
        System.out.println(n+" *"+i+"=" +n*i);
      }
}
}