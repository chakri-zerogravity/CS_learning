// switch statement is used to select many blocks in a code 

import java.util.Scanner;

public class switch_statement {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner num = new Scanner(System.in)) {
            System.out.println("enter a number");

            //example

            while (true){
                // here while statement continously run the program 

            int day =num.nextInt();


            if (day >=8) {
                System.out.println("Enter a number between 1 to 7");
                }

                // Here if condition is give so if the entered number is greater than 7 it will ask the user to enter a number between 1 to 7
            



            switch (day) {
                case 1:
                System.out.println("Monday");

                    
                    break;

                    case 2:
                    System.out.println("Tuesday");
   
                        
                        break;

                        case 3:
                        System.out.println("Wednesday");
            
                            
                            break;

                            case 4:
                            System.out.println("Thursday");
                
                                
                                break;
                                case 5:
                                System.out.println("Friday");
                    
                                    
                                    break;

                                    case 6:
                                    System.out.println("Saturday");
                        
                                        
                                        break;

                                        case 7:
                                        System.out.println("Sunday");
                            
                                            
                                            break;


                                            
                                    

                   

            
                default:
                    break;
            }
            }
        }
        
    }


    
}
