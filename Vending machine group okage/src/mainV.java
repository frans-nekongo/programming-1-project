import java.util.Scanner;
public class mainV {
    public static final Scanner keyboard= new Scanner(System.in);
    //Scanner keyboard=new Scanner(System.in);//

    static void customerMenu() {
        System.out.println(" ---------------------------------------------");
        System.out.println("       VendingMch1234 ,264 hemingway          ");
        System.out.println(" _____________________________________________");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");

        System.out.println("                                              ");
        System.out.println(" Please select your product: ");
    }
    static void ownerMenu(){
        System.out.println("welcome admin what would you like to do");
        System.out.println("1.add stock");
        System.out.println("2.change price");
        System.out.println("3.cash out");
        System.out.println("4.cash in");
        System.out.println("5.show items in stock");
        System.out.println("6.show available money");
    }
    static void products(){}
    static void change(){}
    static void load_page(){
        System.out.println("select from the options below");
        System.out.println("1.customer");
        System.out.println("2.Owner");
        System.out.println("selection: ");
        int selection=keyboard.nextInt();
        if (selection==1){
            customerMenu();
        }else  if (selection==2){
            //prompting for admin verification code//
            System.out.println("enter security code: ");
            int sCode=keyboard.nextInt();
            if (sCode==100101) {
                ownerMenu();}else {
                System.out.println("wrong password or invalid entry");
                load_page();
            }
        }else {
            System.out.println("invalid selection");
            load_page();}
    }


    public static void main(String[]args){
        int securityCode=100101;
        //takes you to loading page//
        load_page();
    }
}