package Lab3Q;
/*
Name: Besma Serrai
Date: March 9th, 2023
Q1.Student Number: 251274226
Description: This program contains methods in a class that I will be calling later on
 */

public class MyMethod { //public class called MyMethod will store all of my methods
    final public static double PI = 3.141592653589793; // declaring my PI variable

    public static double myPow(double x, int y){// first method called mypow that calculates the value of one number to the power of another,
                                                // it accepts two double type variables and returns a double type variable
        double result = 1;
        if(y<0){//using an if statement to evaluate the power if it is less than 0
        while (y<0) {//using a while loop within the if statement
            result = result * x;
            y++;
        }//end of while loop
            return 1/result;}// end of if statement
        else{// else statement if the first if statement is not met
            while (y>0){//while loop within if statement used to evaluate output if the inputted value is greater than 0
            result = result * x;
            y--;}//end of while loop
            return result;}//end of else statement
    }// end of mypow method
    public static double myFactorial(int o){//second method is myfactorial method that acceptes an integer value and calculates it's
        // factorial and returns a double
        double result = 1;
        for(int i=1; i<=o ; i++)
            result = result*i;
            return result;
        //return statement
    }//end of myfactorial method
    public static double mySin(double x){//third method called mySin will accept and return a double type variabled,
        //it will calculate the sin of a value in degrees using the algebraic expression provided in the lab assignment
        int N=20, n;
        double y=0;
        for (n=0; n<N; n++) {//beginning of for loop, used to calculate sin of some value
            double p1 = myPow(-1,n);//first expression used in the algebraic expression, formatted by calling earlier created mypow method
            double p2 = myFactorial((2*n+1));//second expression that is formatted by calling earlier created myfactorial method
            double p3 = myPow(x,(2*n+1));//third expression that is formatted again by calling mypow method
            y = y + (p1 / p2) * p3;//final expression used by combining all previous expressions
        }//end of for loop
        return y;//return statement
    }//end of mysin method
    public static double myCos(double x){//fourth method called mycos, will accept and return a double type variable
        //same thing as mysin will calculate the cos of a value entered as degrees using the algebraic expression provided in the lab assignment
        int N=20, n;
        double y=0;
        for (n=0; n<N; n++) {//beginning of for loop, again used to calculate cos of inputted value, same as the for loop in mysin method
            double p1 = myPow(-1,n);//first expression formatted by calling my mypow method
            double p2 = myFactorial((2*n));//second expression formatted by calling my myfactorial method
            double p3 = myPow(x,(2*n));//third expression formatted by calling my mypow method again
            y = y + (p1 / p2) * p3;//final expression used to calculate cos value using the algebraic expression provided in lab assignment
        }//end of for loop
        return y;//return statement
    }//end of my mycos method
    public static double myDegreeToRadians(double d){/*fifth method that will accept and return a double type variable, used in the driver class to convert
        fromt degrees to radians */
        return (d*PI)/180.0;// return statement and algebraic expression meant to convert from degrees to radians
    }//end of mydegreetoradians method
    public static char myToLowerCase(char c){//sixth method that will accept and return a char type variable and will convert an uppercase char variabke to lowercare
        if((int) c >= 65 && (int) c <= 90){//if statement created using information about uppercase and lowercase char variables from ASCII
        c = (char)((int) c + 32);
        }//end of if statement
        return (char) c;//return statement
    }//end of mytolowercase method
    public static void myHeader(int ln, int qn, String description){//myheader method, accepts two int variables and a string
        System.out.print("****************************************************");
        System.out.print("\nFull name: Besma Serrai");
        System.out.printf("\nLab Assignment: %d, Question: %d", ln, qn);
        System.out.printf("\nProgram Description: %s", description);
        System.out.print("\n****************************************************");
    }
    public static void myFooter(int qn){//myfooter method that accepts an int variable
        System.out.printf("\n*** Signing off from Question %d - Besma ***", qn);
    }
}
