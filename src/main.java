import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner tech = new Scanner(System.in);

        System.out.println("Give me a number to add"); //it needs a number to add
        int number = tech.nextInt();

        System.out.println("Thank you\ngive me another number."); //it needs another number to combine with
        int number2 = tech.nextInt();

        int result = number + number2; //it now does the math

        System.out.println(number + "+" + number2 + "=" + result); //final solution it shows the full progress of addition
        }
    }
