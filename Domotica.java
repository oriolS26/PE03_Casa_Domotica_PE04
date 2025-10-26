import java.util.Scanner;

public class Domotica {
    static boolean blinds;
    static String blindsControl;
    static Scanner scanner = new Scanner(System.in);
    static boolean blindsdiningroom = false , blindskitchen = false, blindsbathroom = false, blindsroom1 = false, blindsroom2 = false, blindsroom3 = false;
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
                System.out.println("--------------------------");
                System.out.println("You have chosen to exit");
                System.out.println("--------------------------");
                break;
            default:
                System.out.println("--------------------------");
                System.out.println("Invalid option");
                System.out.println("--------------------------");
                break;
        
            }
        } while (!opcio1.equalsIgnoreCase("5"));
    }

        public static void blinds(){
            do {
            System.out.println("-------------------------------------");
            System.out.println("You have chosen the blinds control");
            System.out.println("-------------------------------------");
            System.out.println("Please, chose the room you would like to control the blinds on: ");
            System.out.println("-------------------------------------");
            ChoseRoom();
    
            opcio2 = scanner.nextLine();
            
            switch (opcio2) {
                case "1":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the dining room: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindsdiningroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type: open");
                System.out.println("If you want to close the blinds type: close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the dining room");
                    blindsdiningroom = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the dining room");
                    blindsdiningroom = false;
                }
                break;
                case "2":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Kitchen: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindskitchen ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type: open");
                System.out.println("If you want to close the blinds type: close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Kitchen");
                    blindskitchen = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Kitchen");
                    blindskitchen = false;
                }
                break;
                case "3":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Bathroom: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindsbathroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type: open");
                System.out.println("If you want to close the blinds type: close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Bathroom");
                    blindsbathroom = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Bathroom");
                    blindsbathroom = false;
                }
                break;
                case "4":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 1: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindsroom1 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type: open");
                System.out.println("If you want to close the blinds type: close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Room 1");
                    blindsroom1 = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Room 1");
                    blindsroom1 = false;
                }
                break;
                case "5":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 2: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindsroom2 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type: open");
                System.out.println("If you want to close the blinds type: close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Room 2");
                    blindsroom2 = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Room 2");
                    blindsroom2 = false;
                }
                break;
                case "6":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 3: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your blinds in the dining room: " + (blindsroom3 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open the blinds type open");
                System.out.println("If you want to close the blinds type close");
                blindsControl = scanner.nextLine();
    
                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Room 3");
                    blindsroom3 = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Room 3");
                    blindsroom3 = false;
                }
                break;
                case "7":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control all the rooms simultaneously: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of all the blinds in the house: " + (blindsdiningroom ? " Dining room: OPEN " : " Dining room: CLOSED ") + (blindskitchen ? " Kitchen: OPEN " : " Kitchen: CLOSED ") + (blindsbathroom ? " Bathroom: OPEN " : " Bathroom: CLOSED ") + (blindsroom1 ? " Room 1: OPEN " : " Room 1: CLOSED ") + (blindsroom2 ? " Room 2: OPEN " : " Room 2: CLOSED ") + (blindsroom3 ? " Room 3: OPEN " : " Room 3: CLOSED "));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to fully open all the blinds type: open");
                System.out.println("If you want to close all the blinds type: close");
                blindsControl = scanner.nextLine();

                if (blindsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the blinds on the Room 3");
                    blindsdiningroom = true;
                    blindskitchen = true;
                    blindsbathroom = true;
                    blindsroom1 = true;
                    blindsroom2 = true;
                    blindsroom3 = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds on the Room 3");
                    blindsdiningroom = false;
                    blindskitchen = false;
                    blindsbathroom = false;
                    blindsroom1 = false;
                    blindsroom2 = false;
                    blindsroom3 = false;
                }
                break;
                case "8":
                Returnmenu();
                break;
                default:{
                System.out.println("Invalid Option");
                }
                break;
                
            }
            
        } while (!opcio2.equalsIgnoreCase("8"));
    }

    public static void Air(){
    boolean Airdiningroom = false , Airkitchen = false, Airbathroom = false, Airroom1 = false, Airroom2 = false, Airroom3 = false;
    String opcio3;
    String AirControl;
    }

    public static void Speakers(){

    }

    public static void Curtains(){

    }
    public static void ChoseRoom(){
        System.out.println("-------------------------------------");
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
    public static void Returnmenu() {
        System.out.println("------------------------------------");
                System.out.println("Returning to Main menu...");
                System.out.println("------------------------------------");
                System.out.println("Successfully returned to Main menu!");
    }
}
