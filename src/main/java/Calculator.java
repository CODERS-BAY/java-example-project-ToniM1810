import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        boolean terminate = false;
        do {
            Scanner buchstabe = new Scanner(System.in);
            Scanner number = new Scanner(System.in);
            System.out.println("Would you like to make floating point calculations?\n" +
                    "type y for yes and anything else for integer calculations");
            String yes = buchstabe.nextLine();
            while (!yes.equals("y") && !yes.equals("n")) {
                System.out.println("Enter y or n");
                yes = buchstabe.nextLine();
            }

            System.out.println( "Type in the first Number");
            int number1 = number.nextInt();
            System.out.println( "Type in the second number");
            int number2 = number.nextInt();

            System.out.println("""
                    You can make the following calculations:
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c

                    To select a calculation please press the corresponding number.""");
            int choose = number.nextInt();

            double erg = calculator(number1, number2, choose);
            if (yes.equals("y")) {
                System.out.print(erg);
            }
             else {
                 int cast = (int) erg;
                    System.out.print(cast);
                }
            System.out.println();

            System.out.println("Would you like to calculate again, press y");
            yes = buchstabe.nextLine();
            if (!yes.equals("y")) {
                terminate = true;
            }


        } while (!terminate);

    }
    private static double calculator( double number1, double number2, int choose ) {

        switch (choose) {
            case 1:
                double erg1 = number1 + number2;
                System.out.print(number1 + "+" + number2 + "=");
                return erg1;
            case 2:
                double erg2 = number1 - number2;
                System.out.print(number1 + "-" + number2 + "=");
                return erg2;
            case 3:
                double erg3 = number1 / number2;
                System.out.print(number1 + "/" + number2 + "=");
                return erg3;
            case 4:
                double erg4 = number1 % number2;
                System.out.print(number1 + "%" + number2 + "=");
                return erg4;
            case 5:
                double erg5 = Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2));
                System.out.print(number1 + "^2" + number2 + "^2" + "=");
                return erg5;
            default:
                return 0;


        }
    }


}
