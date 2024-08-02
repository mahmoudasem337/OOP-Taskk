/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OOP_BadDesign;

//Violates SRP , OCP
// Think how to make this code follows SOLID
// For SRP : Make 4 Classes , each class for 1 mathematics OP
//For OCP : Make Operation Interface , implement it by 4 classes +,-,*,/ , Make a composition relation in main class by interface 

public class OOPTask  {
public static int addition(int num1, int num2) {
        int result=num1+num2;
        return result;
    }
public static int subtraction(int num1, int num2) {
        int result=num1-num2;
        return result;
    }
public static int multiplication(int num1, int num2) {
        int result=num1*num2;
        return result;
    }
public static int division(int num1, int num2) {
        int result=num1/num2;
        return result;
    }
    public static void main(String[] args) {
        int a=10;
        int b=2;
        
        System.out.println("addition of " + a + " and " + b + " is: " +addition(a,b) );
        System.out.println("subtraction of " + a + " and " + b + " is: " +subtraction(a,b) );
        System.out.println("multiplication of " + a + " and " + b + " is: " +multiplication(a,b) );
        System.out.println("division of " + a + " and " + b + " is: " +division(a,b) );


       }
}
