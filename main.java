import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String cusName = scanner.nextLine();
        System.out.print("\n");
        
        System.out.println("Choose room type (1, 2, 3):\n1 : Sea view -> $120\n2 : Second Sea View -> $80\n3 : Garden view -> $40");
        int roomTypeInput = scanner.nextInt();
        String roomType = typeOfRoom(roomTypeInput);
        int roomTypePrice = pricesOfRoom(roomTypeInput);
        System.out.print("\n");

        System.out.println("Enter total room (1, 2, 3, 4, etc...):");
        int totalRoom = scanner.nextInt();
        System.out.print("\n");

        int prices = roomTypePrice * totalRoom;

        System.out.println("Welcome to Ngapali Hotel");
        System.out.print("\n");

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("CUSTOMER NAME\t\tROOM TYPE\t\tTOTAL ROOM\t\tPRICES");
        System.out.println(cusName + "\t\t\t" + roomType + "\t\t" + totalRoom + "\t\t\t$" + prices);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("\n");

        scanner.nextLine(); //to handle error

        System.out.println("Do you want to continue the order (Y/N)");
        String confirm = scanner.nextLine();
        System.out.print("\n");
        
        confirmation(confirm);
    }

    public static String typeOfRoom(int type) {
        switch(type) {
            case 1:
                return "Sea View";
            case 2:
                return "Second Sea View";
            case 3:
                return "Garden View";
            default:
                return "none";
        }
    }

    public static int pricesOfRoom(int p) {
        switch(p) {
            case 1: 
                return 120; 
            case 2:
                return 80;
            case 3:
                return 40;
            default:
                return 0;
        }
    }

    public static void confirmation(String con) {
        switch(con) {
            case "Y":
                System.out.println("You have successfully registered.");
                break;
            case "y":
                System.out.println("You have successfully registered.");
                break;
            default:
                System.out.println("Your order has cancelled.");
        }
    }
}