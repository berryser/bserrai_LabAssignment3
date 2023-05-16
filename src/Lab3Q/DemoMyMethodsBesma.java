package Lab3Q;
import java.util.Scanner;

public class DemoMyMethodsBesma {//driver class called demomethodsbesma
    public static void main(String[] args) {//main method
        MyMethod.myHeader(3, 1, "Program that performs a set of mathematical operations based on the user input's " +
                "choice of letter");
        //caliing my myheader method from mymethod class and passing arguments
        Scanner input = new Scanner(System.in);
        //instantiating scanner
        char choice;
        //intialising variable
        while (true) {
            //beginning of while loop with a boolean condition
            System.out.println("\nTesting Mathematical Functions:");
            System.out.println("\n\n======MENU=======");
            System.out.println("a: Power Function");
            System.out.println("b: Factorial Function");
            System.out.println("c: Sine Function");
            System.out.println("d: Cosine Function");
            System.out.println("e: exit");
            System.out.println("==================");
            System.out.print("\n\nEnter you choice: ");
            //printing menu as per assignment request
            choice = input.next().charAt(0);
            //setting choice variable as user inputb
            choice = MyMethod.myToLowerCase(choice);
            //calling mytolowercase method from mymethod class to convert choice variable if need be
            switch (choice) {
                //beginning of switch statement
                case 'a':
                    //first case being set to a
                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y");
                    System.out.print("Enter x: ");
                    double x = input.nextDouble();
                    //setting x as user input
                    System.out.print("Enter y: ");
                    int y = input.nextInt();
                    //setting y as user input
                    System.out.printf("%.2f^%d = %.2f", x, y, MyMethod.myPow(x, y));
                    //calling mypow method from mymethod class to calculate value
                    break;
                    //break statement
                case 'b':
                    //second case being set to b as per the menu list
                    System.out.println("\nFACTORIAL FUNCTION: Calculating factorial(n).");
                    System.out.print("Enter n: ");
                    int n = input.nextInt();
                    //setting n as userinput
                    System.out.printf("%d! = %.2f", n, MyMethod.myFactorial(n));
                    //calling myfactorial method from my method class and calculating the factorial of the inputted value
                    break;
                    //break statement
                case 'c':
                    //third case beint set to c as per the menu list
                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree.");
                    System.out.print("Enter m in degrees: ");
                    double k = input.nextDouble();
                    //setting k as userinput
                    System.out.printf("sin(%.2f) degree = %.2f", k, MyMethod.mySin(MyMethod.myDegreeToRadians(k)));
                    /*calling both the mysin and mydegreetoradians method from my method class to calculate
                    the sin of the inputted value and convert degrees to radians*/
                    break;
                    //break statement
                case 'd':
                    //last case being set to d as per the menu list
                    System.out.println("\nCOSINE FUNCTION: Calculating cos(m) degree.");
                    System.out.print("Enter m in degrees: ");
                    double m = input.nextDouble();
                    //setting m as user input
                    System.out.printf("cos(%.2f) degree = %.2f", m, MyMethod.myCos(MyMethod.myDegreeToRadians(m)));
                    /*again calling both mycos and mydegreetoradians method from mymethod class to calculate the cos of the inputted
                    value and convert degrees to radians*/
                    break;
                    //break statement
                default:
                    //setting a default case
                    if(choice == 'e') break;
                    //breaking if the choice is e as per the assignment using an if statement
                    else System.out.print("Invalid Choice!");
                    //printing invalid choice using an else statement if the user input is anything but a b c d or e
            }//end of switch statement
            if(choice == 'e') break;}
        //if statement used again if the choice is e to break out of the while loop
        MyMethod.myFooter(1);
        //calling myfooter method from my method class
        }
    }


