import java.util.Scanner;

public class Additionoftwonumbers {


    /**
     * 
     */
    public static void main(){
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter a number");


            int a = num.nextInt();
            
            int b = num.nextInt();

            int c = (a + b);
            if(c > 100){
                System.out.println("Congrats");
            }
            else{
                System.out.println("try again");
            }
        }

        
    }

    
}
