import java.util.Scanner;

public class Domotica {
    static boolean blinds;
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        String opcio1;
        do {
        System.out.println("Menu: ");
        System.out.println("Choose what you prefer to control: ");
        System.out.println("1: Blinds");
        System.out.println("2: Air Conditioner");
        System.out.println("3: Speakers");
        System.out.println("4: Curtains");
        System.out.println("5: Exit");
        System.out.println("Please put your choice below: ");

        opcio1 = scanner.nextLine();

        switch (opcio1) {
            case "1":
                blinds();
                break;
            case "2":
                Air();
                break;
            case "3":
                Speakers();
            case "4":
                Curtains();
            case "5":
                System.out.println("You have chosen to exit");
            default:
                break;
        
            }
        } while (!opcio1.equals("5"));
    }

    public static void blinds(){

    }

    public static void Air(){

    }

    public static void Speakers(){

    }

    public static void Curtains(){

    }
}