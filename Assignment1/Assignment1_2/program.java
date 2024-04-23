import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        displaymenu();
        int totalbill=order();
        System.out.println("TOTAL BILL = "+totalbill);
    }

    public static void displaymenu() {

        System.out.println("1. Dosa     Rs.60");
        System.out.println("2. Samosa   Rs.20");
        System.out.println("3. Vadapav  Rs.20");
        System.out.println("4. Idli     Rs.70");
        System.out.println("5. Misal    Rs.100");
        System.out.println("6. Upma     Rs.30");
        System.out.println("7. Poha     Rs.30");
        System.out.println("8. Paratha  Rs.120");
        System.out.println("9. PavBhaji Rs.70");
        System.out.println("10. Generate Bill\n");
    }

    public static int choose() {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Enter the choice from menu");

        choice = sc.nextInt();
       
        return choice;
    }

    public static int order() {
        int choice=0;
        int bill = 0;
        int Q=0;
       
        Scanner s=new Scanner(System.in);
        while ((choice = choose()) != 10) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(60);
                    break;
                case 2:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(20);
                    break;
                case 3:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(20);
                    break;
                case 4:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(70);
                    break;
                case 5:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(100);
                    break;
                case 6:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(30);
                    break;
                case 7:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(30);
                    break;
                case 8:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(120);
                    break;
                case 9:
                    System.out.println("Enter the Quantity");
                    Q=s.nextInt();
                    bill = bill + Q*(70);
                    break;
                default:
                    System.out.println("wrong entry");
                    break;
            }
        }
        return bill;
    }
}
