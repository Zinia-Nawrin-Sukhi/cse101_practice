    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int size = 0;
           Character c ;
           System.out.println("Enter size of the Rhombus : ");
           size = sc.nextInt();
           System.out.println("Which character you want to use : ");
           c = sc.next().charAt(0);
           for (int row = 0;row < size ; row++){
               //first print the space
               for (int space = size - row ; space < size ; space ++){
                   System.out.print(" ");
               }
               //print the character
               for (int i = 0 ; i<size ; i++){
                   System.out.print(c);
               }
               //add a newline
               System.out.println();
           }
        }
    }