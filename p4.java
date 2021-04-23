import java.util.Scanner;
public class p4
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int x=sc.nextInt();
    
    System.out.println("please enter a number");
    int y=sc.nextInt();
    if(x<y)
    {
      for(int i=1;i<=y;i++)
      {
       
        for(int j=i;j>=i%x;j++)
        {
          System.out.print(i+" ");
        }
    
    
      }

    }
    
      
  }
}
