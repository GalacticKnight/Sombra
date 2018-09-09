import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner tech = new Scanner(System.in);
        System.out.println("tell me your name");
        String name = tech.nextLine();
        System.out.println("hello " + name);
        System.out.println("How old are you?");
        int age = tech.nextInt();
        if (age <= 17){
            System.out.println(age + " years old is not old");
        } else {
            System.out.println(age + " years old is decent");


        }


    }

}