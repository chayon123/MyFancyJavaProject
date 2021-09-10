import java.util.Scanner;

//singleton pattern
public class Calculator {
  private static Calculator instance = null;
  private Calculator(double number1,double number2) {
      Double number1;
      Double number2;

  }
  public static Calculator getInstance() {
     if (instance == null) {
        instance = new Calculator();
     }
     return instance;
   }

}

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1,number2,result;

    // get instance by singleton pattern
    Calculator instance = Calculator.getInstance(number1,number2);


    Scanner input = new Scanner(System.in);


    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);


    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {


      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;


      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;


      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;


      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:

        System.out.println("new changes for 8th sept commit")
        break;
    }

    input.close();
  }
}
