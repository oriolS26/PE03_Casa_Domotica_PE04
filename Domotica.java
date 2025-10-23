import java.util.Scanner;

public class Domotica {
    static boolean blinds;
    static String blindsControl;
    static Scanner scanner = new Scanner(System.in);
    static boolean blindsdiningroom = false , blindskitchen = false, blindsbathroom = false, blindsroom1 = false, blindsroom2 = false, blindsroom3 = false, blindsallrooms = false;
    static String opcio2;
        public static void main(String[] args) {
        String opcio1;
        do {
        System.out.println("-----------------------------------");
        System.out.println("Menu: ");
        System.out.println("-----------------------------------");
        System.out.println("Choose what you prefer to control: ");
        System.out.println("1: Blinds");
        System.out.println("2: Air Conditioner");
        System.out.println("3: Speakers");
        System.out.println("4: Curtains");
        System.out.println("5: Exit");
        System.out.println("-----------------------------------");
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
                break;
            case "4":
                Curtains();
                break;
            case "5":
                System.out.println("You have chosen to exit");
                break;
            default:
                System.out.println("Invalid option");
                break;
        
            }
        } while (!opcio1.equals("5"));
    }

    public static void blinds(){
        do {
        System.out.println("-------------------------------------");
        System.out.println("You have chosen the blinds control");
        System.out.println("-------------------------------------");
        System.out.println("Please, chose the room you would like to control the blinds on: ");
        System.out.println("-------------------------------------");
        ChoseRoom();

        String opcio2 = scanner.nextLine();
        
        switch (opcio2) {
            case "1":
            System.out.println("You have chosen to control the dining room: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindsdiningroom ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type: open");
            System.out.println("If you want to close the blinds type: close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the dining room");
                blindsdiningroom = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the dining room");
                blindsdiningroom = false;
            }
            break;
            case "2":
            System.out.println("You have chosen to control the Kitchen: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindskitchen ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type: open");
            System.out.println("If you want to close the blinds type: close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the Kitchen");
                blindskitchen = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the Kitchen");
                blindskitchen = false;
            }
            break;
            case "3":
            System.out.println("You have chosen to control the Bathroom: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindsbathroom ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type: open");
            System.out.println("If you want to close the blinds type: close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the Bathroom");
                blindsbathroom = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the Bathroom");
                blindsbathroom = false;
            }
            break;
            case "4":
            System.out.println("You have chosen to control the Room 1: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindsroom1 ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type: open");
            System.out.println("If you want to close the blinds type: close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the Room 1");
                blindsroom1 = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the Room 1");
                blindsroom1 = false;
            }
            break;
            case "5":
            System.out.println("You have chosen to control the Room 2: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindsroom2 ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type: open");
            System.out.println("If you want to close the blinds type: close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the Room 2");
                blindsroom2 = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the Room 2");
                blindsroom2 = false;
            }
            break;
            case "6":
            System.out.println("You have chosen to control the Room 3: ");
            System.out.println("This is the state of your blinds in the dining room: " + (blindsroom3 ? "ON" : "OFF"));
            System.out.println("If you want to fully open the blinds type open");
            System.out.println("If you want to close the blinds type close");
            blindsControl = scanner.nextLine();

            if (blindsControl.equals("OPEN".trim().toLowerCase())){
                System.out.println("You have successfully opened the blinds on the Room 3");
                blindsroom3 = true;
            }
            else if (blindsControl.equals("CLOSE".trim().toLowerCase())){
                System.out.println("You have successfully closed the blinds on the Room 3");
                blindsroom3 = false;
            }
            break;
            default:{
            System.out.println("Invalid Option");
            }
            break;
            
        }
        
    }

    public static void Air(){

    }

    public static void Speakers(){

    }

    public static void Curtains(){

    }
    public static void ChoseRoom(){
        System.out.println("Chose 1 for dining room");
        System.out.println("Chose 2 for kitchen");
        System.out.println("Chose 3 for bathroom");
        System.out.println("Chose 4 for room 1");
        System.out.println("Chose 5 for room 2");
        System.out.println("Chose 6 for room 3");
        System.out.println("Chose 7 to control all rooms simultaneously");
        System.out.println("Chose 8 to exit to Main Menu");
        System.out.println("-------------------------------------");
    }
}
