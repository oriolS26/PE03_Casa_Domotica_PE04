import java.util.Scanner;

public class Domotica {
     boolean blinds;
     String blindsControl;
     Scanner scanner = new Scanner(System.in);
     boolean blindsdiningroom = false , blindskitchen = false, blindsbathroom = false, blindsroom1 = false, blindsroom2 = false, blindsroom3 = false;
     String opcio2;
        public void main(String[] args) {
            Domotica p = new Domotica();
            p.principal();
        }
        public void principal(){
            int varPrincipal = 0;
        
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
        System.out.println("5: Automatic Mode");
        System.out.println("6: Exit");
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
                AutomaticMode();
                break;
            case "6":
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
        } while (!opcio1.equalsIgnoreCase("6"));
    }

        public  void blinds(){
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
                System.out.println("This is the state of your blinds in the Kitchen: " + (blindskitchen ? "OPEN" : "CLOSED"));
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
                System.out.println("This is the state of your blinds in the Bathroom: " + (blindsbathroom ? "OPEN" : "CLOSED"));
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
                System.out.println("This is the state of your blinds in the Room 1: " + (blindsroom1 ? "OPEN" : "CLOSED"));
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
                System.out.println("This is the state of your blinds in the Room 2: " + (blindsroom2 ? "OPEN" : "CLOSED"));
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
                System.out.println("This is the state of your blinds in the Room 3: " + (blindsroom3 ? "OPEN" : "CLOSED"));
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
                    System.out.println("You have successfully opened the blinds in the house");
                    blindsdiningroom = true;
                    blindskitchen = true;
                    blindsbathroom = true;
                    blindsroom1 = true;
                    blindsroom2 = true;
                    blindsroom3 = true;
                }
                else if (blindsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the blinds in the house");
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

    public  void Air(){
    boolean Airdiningroom = false , Airkitchen = false, Airbathroom = false, Airroom1 = false, Airroom2 = false, Airroom3 = false;
    String opcio3;
    String AirControl;
    do {
            System.out.println("-------------------------------------");
            System.out.println("You have chosen the Air Conditioner control");
            System.out.println("-------------------------------------");
            System.out.println("Please, chose the room you would like to control the Air Conditioner on: ");
            System.out.println("-------------------------------------");
            ChoseRoom();
    
            opcio3 = scanner.nextLine();
            
            switch (opcio3) {
                case "1":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the dining room: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the dining room: " + (Airdiningroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type: open");
                System.out.println("If you want to close the Air Conditioner type: close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the dining room");
                    Airdiningroom = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the dining room");
                    Airdiningroom = false;
                }
                break;
                case "2":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Kitchen: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the Kitchen: " + (Airkitchen ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type: open");
                System.out.println("If you want to close the Air Conditioner type: close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the Kitchen");
                    blindskitchen = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the Kitchen");
                    Airkitchen = false;
                }
                break;
                case "3":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Bathroom: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the Bathroom: " + (Airbathroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type: open");
                System.out.println("If you want to close the Air Conditioner type: close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the Bathroom");
                    Airbathroom = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the Bathroom");
                    Airbathroom = false;
                }
                break;
                case "4":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 1: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the Room 1: " + (Airroom1 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type: open");
                System.out.println("If you want to close the Air Conditioner type: close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the Room 1");
                    Airroom1 = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the Room 1");
                    Airroom1 = false;
                }
                break;
                case "5":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 2: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the Room 2: " + (Airroom2 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type: open");
                System.out.println("If you want to close the Air Conditioner type: close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the Room 2");
                    Airroom2 = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the Room 2");
                    Airroom2 = false;
                }
                break;
                case "6":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 3: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Air Conditioner in the Room 3: " + (Airroom3 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Air Conditioner type open");
                System.out.println("If you want to close the Air Conditioner type close");
                AirControl = scanner.nextLine();
    
                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner on the Room 3");
                    Airroom3 = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner on the Room 3");
                    Airroom3 = false;
                }
                break;
                case "7":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control all the rooms simultaneously: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of all the Air Conditioner in the house: " + (Airdiningroom ? " Dining room: OPEN " : " Dining room: CLOSED ") + (Airkitchen ? " Kitchen: OPEN " : " Kitchen: CLOSED ") + (Airbathroom ? " Bathroom: OPEN " : " Bathroom: CLOSED ") + (Airroom1 ? " Room 1: OPEN " : " Room 1: CLOSED ") + (Airroom2 ? " Room 2: OPEN " : " Room 2: CLOSED ") + (Airroom3 ? " Room 3: OPEN " : " Room 3: CLOSED "));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open all the Air Conditioner type: open");
                System.out.println("If you want to close all the Air Conditioner type: close");
                AirControl = scanner.nextLine();

                if (AirControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Air Conditioner in the House");
                    Airdiningroom = true;
                    Airkitchen = true;
                    Airbathroom = true;
                    Airroom1 = true;
                    Airroom2 = true;
                    Airroom3 = true;
                }
                else if (AirControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Air Conditioner in the House");
                    Airdiningroom = false;
                    Airkitchen = false;
                    Airbathroom = false;
                    Airroom1 = false;
                    Airroom2 = false;
                    Airroom3 = false;
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
            
        } while (!opcio3.equalsIgnoreCase("8"));
    }

    public  void Speakers(){
    boolean Speakersdiningroom = false , Speakerskitchen = false, Speakersbathroom = false, Speakersroom1 = false, Speakersroom2 = false, Speakersroom3 = false;
    String opcio4;
    String SpeakersControl;
    do {
            System.out.println("-------------------------------------");
            System.out.println("You have chosen the Speakers control");
            System.out.println("-------------------------------------");
            System.out.println("Please, chose the room you would like to control the Speakers on: ");
            System.out.println("-------------------------------------");
            ChoseRoom();
    
            opcio4 = scanner.nextLine();
            
            switch (opcio4) {
                case "1":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the dining room: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the dining room: " + (Speakersdiningroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type: open");
                System.out.println("If you want to close the Speakers type: close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the dining room");
                    Speakersdiningroom = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the dining room");
                    Speakersdiningroom = false;
                }
                break;
                case "2":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Kitchen: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the Kitchen: " + (Speakerskitchen ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type: open");
                System.out.println("If you want to close the Speakers type: close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the Kitchen");
                    Speakerskitchen = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the Kitchen");
                    Speakerskitchen = false;
                }
                break;
                case "3":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Bathroom: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the Bathroom: " + (Speakersbathroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type: open");
                System.out.println("If you want to close the Speakers type: close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the Bathroom");
                    Speakersbathroom = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the Bathroom");
                    Speakersbathroom = false;
                }
                break;
                case "4":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 1: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the Room 1: " + (Speakersroom1 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type: open");
                System.out.println("If you want to close the Speakers type: close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the Room 1");
                    Speakersroom1 = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the Room 1");
                    Speakersroom1 = false;
                }
                break;
                case "5":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 2: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the Room 2: " + (Speakersroom2 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type: open");
                System.out.println("If you want to close the Speakers type: close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the Room 2");
                    Speakersroom2 = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the Room 2");
                    Speakersroom2 = false;
                }
                break;
                case "6":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 3: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Speakers in the Room 3: " + (Speakersroom3 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Speakers type open");
                System.out.println("If you want to close the Speakers type close");
                SpeakersControl = scanner.nextLine();
    
                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers on the Room 3");
                    Speakersroom3 = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers on the Room 3");
                    Speakersroom3 = false;
                }
                break;
                case "7":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control all the rooms simultaneously: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of all the Speakers in the house: " + (Speakersdiningroom ? " Dining room: OPEN " : " Dining room: CLOSED ") + (Speakerskitchen ? " Kitchen: OPEN " : " Kitchen: CLOSED ") + (Speakersbathroom ? " Bathroom: OPEN " : " Bathroom: CLOSED ") + (Speakersroom1 ? " Room 1: OPEN " : " Room 1: CLOSED ") + (Speakersroom2 ? " Room 2: OPEN " : " Room 2: CLOSED ") + (Speakersroom3 ? " Room 3: OPEN " : " Room 3: CLOSED "));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open all the Speakers type: open");
                System.out.println("If you want to close all the Speakers type: close");
                SpeakersControl = scanner.nextLine();

                if (SpeakersControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Speakers in the House");
                    Speakersdiningroom = true;
                    Speakerskitchen = true;
                    Speakersbathroom = true;
                    Speakersroom1 = true;
                    Speakersroom2 = true;
                    Speakersroom3 = true;
                }
                else if (SpeakersControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Speakers in the House");
                    Speakersdiningroom = false;
                    Speakerskitchen = false;
                    Speakersbathroom = false;
                    Speakersroom1 = false;
                    Speakersroom2 = false;
                    Speakersroom3 = false;
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
            
        } while (!opcio4.equalsIgnoreCase("8"));
    }

    public  void Curtains(){
    boolean Curtainsdiningroom = false , Curtainskitchen = false, Curtainsbathroom = false, Curtainsroom1 = false, Curtainsroom2 = false, Curtainsroom3 = false;
    String opcio5;
    String CurtainsControl;
    do {
            System.out.println("-------------------------------------");
            System.out.println("You have chosen the Curtains control");
            System.out.println("-------------------------------------");
            System.out.println("Please, chose the room you would like to control the Curtains on: ");
            System.out.println("-------------------------------------");
            ChoseRoom();
    
            opcio5 = scanner.nextLine();
            
            switch (opcio5) {
                case "1":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the dining room: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the dining room: " + (Curtainsdiningroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type: open");
                System.out.println("If you want to close the Curtains type: close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the dining room");
                    Curtainsdiningroom = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the dining room");
                    Curtainsdiningroom = false;
                }
                break;
                case "2":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Kitchen: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the Kitchen: " + (Curtainskitchen ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type: open");
                System.out.println("If you want to close the Curtains type: close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the Kitchen");
                    Curtainskitchen = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the Kitchen");
                    Curtainskitchen = false;
                }
                break;
                case "3":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Bathroom: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the Bathroom: " + (Curtainsbathroom ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type: open");
                System.out.println("If you want to close the Curtains type: close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the Bathroom");
                    Curtainsbathroom = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the Bathroom");
                    Curtainsbathroom = false;
                }
                break;
                case "4":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 1: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the Room 1: " + (Curtainsroom1 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type: open");
                System.out.println("If you want to close the Curtains type: close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the Room 1");
                    Curtainsroom1 = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the Room 1");
                    Curtainsroom1 = false;
                }
                break;
                case "5":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 2: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the Room 2: " + (Curtainsroom2 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type: open");
                System.out.println("If you want to close the Curtains type: close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the Room 2");
                    Curtainsroom2 = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the Room 2");
                    Curtainsroom2 = false;
                }
                break;
                case "6":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control the Room 3: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of your Curtains in the Room 3: " + (Curtainsroom3 ? "OPEN" : "CLOSED"));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open the Curtains type open");
                System.out.println("If you want to close the Curtains type close");
                CurtainsControl = scanner.nextLine();
    
                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains on the Room 3");
                    Curtainsroom3 = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains on the Room 3");
                    Curtainsroom3 = false;
                }
                break;
                case "7":
                System.out.println("--------------------------------------------------------");
                System.out.println("You have chosen to control all the rooms simultaneously: ");
                System.out.println("--------------------------------------------------------");
                System.out.println("This is the state of all the Curtains in the house: " + (Curtainsdiningroom ? " Dining room: OPEN " : " Dining room: CLOSED ") + (Curtainskitchen ? " Kitchen: OPEN " : " Kitchen: CLOSED ") + (Curtainsbathroom ? " Bathroom: OPEN " : " Bathroom: CLOSED ") + (Curtainsroom1 ? " Room 1: OPEN " : " Room 1: CLOSED ") + (Curtainsroom2 ? " Room 2: OPEN " : " Room 2: CLOSED ") + (Curtainsroom3 ? " Room 3: OPEN " : " Room 3: CLOSED "));
                System.out.println("--------------------------------------------------------");
                System.out.println("If you want to open all the Curtains type: open");
                System.out.println("If you want to close all the Curtains type: close");
                CurtainsControl = scanner.nextLine();

                if (CurtainsControl.equalsIgnoreCase("OPEN".trim())){
                    System.out.println("You have successfully opened the Curtains in the House");
                    Curtainsdiningroom = true;
                    Curtainskitchen = true;
                    Curtainsbathroom = true;
                    Curtainsroom1 = true;
                    Curtainsroom2 = true;
                    Curtainsroom3 = true;
                }
                else if (CurtainsControl.equalsIgnoreCase("CLOSE".trim())){
                    System.out.println("You have successfully closed the Curtains in the House");
                    Curtainsdiningroom = false;
                    Curtainskitchen = false;
                    Curtainsbathroom = false;
                    Curtainsroom1 = false;
                    Curtainsroom2 = false;
                    Curtainsroom3 = false;
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
            
        } while (!opcio5.equalsIgnoreCase("8"));
    }
    public  void AutomaticMode(){
    
    }
    public  void ChoseRoom(){
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
    public  void Returnmenu() {
        System.out.println("------------------------------------");
                System.out.println("Returning to Main menu...");
                System.out.println("------------------------------------");
                System.out.println("Successfully returned to Main menu!");
    }
}
