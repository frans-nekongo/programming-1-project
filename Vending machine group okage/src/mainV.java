
import java.util.ArrayList;
import java.util.Scanner;
public class mainV {
    public static final Scanner keyboard= new Scanner(System.in);
    //Scanner keyboard=new Scanner(System.in);//

    static void customerMenu() {
        System.out.println(" ----------WELCOME--DEAR--CUSTOMER------------");
        System.out.println("        VendingMch 2232,WHK,WHK-WEST          ");
        System.out.println(" _____________________________________________");
        System.out.println("            Products available:               ");



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

    static void changeC(){
        int qProducts;
        double change,twenties,tens,fives,ones,fiftyCent,tenCents, fiveCents,ammountTendered,pProducts;
        //quantity of products//
        qProducts=keyboard.nextInt();
        //price of products//
        pProducts=keyboard.nextDouble();
        //amount tendered//
        ammountTendered=keyboard.nextInt();

        double amountToBePaid;
        amountToBePaid=qProducts*pProducts;

        change=ammountTendered-amountToBePaid;
        double ogChange=change;

        twenties=change/20;
        change=change%20;

        tens=change/10;
        change=change%10;

        fives=change/5;
        change=change%5;

        ones= change/1;
        change=change%1;

        fiftyCent=change/0.5;
        change=change%0.5;

        tenCents=change/0.1;
        change=change%0.1;

        fiveCents =change/0.05;
        change=change%0.05;

        int fiveCentRound = (int) Math.round(fiveCents);


        /*System.out.print(" Your change is:N$ ");
        System.out.printf("%6.2f", ogChange);
        System.out.println(" ");
        System.out.println(
                "Disbursed as follows: "+(int)twenties+" x N$20; "
                        +(int)tens+" x N$10; "
                        +(int)fives+" x N$5; "
                        +(int)ones+" x N$1; "
                        + (int)fiftyCent +" x 50c; "
                        +(int)tenCents+" x 10c; "
                        +fiveCentRound+" x 5c");*/
        System.out.println("                  VendingMch 2232,WHK,WHK-WEST                            ");
        System.out.println("__________________________________________________________________________");
        System.out.println("Item                    Qty                    Price                 Total");
        System.out.println("__________________________________________________________________________");
        System.out.println("items[4]+             +quantity+         +prizesOfItems[4]+ "+amountToBePaid);
        System.out.println("__________________________________________________________________________");
        System.out.println("Amount tendered:                                          "+ammountTendered);
        System.out.print("Change                                                     ");
        System.out.printf("%6.2f", ogChange);
        System.out.println(" ");
        System.out.println("Disbursed as follows: "+(int)twenties+" x N$20; "+(int)tens+" x N$10; "+(int)fives+" x N$5; "+(int)ones+" x N$1; "+ (int)fiftyCent +" x 50c; "+(int)tenCents+" x 10c; "+fiveCentRound+" x 5c");
        System.out.println("__________________________________________________________________________");
        System.out.println("                    THANK YOU, PLEASE COME AGAIN!                         ");
    }
    static void receipt(){}
    static void load_page(){
        //select if you are a customer or an admin//
        System.out.println("select from the options below");
        System.out.println("1.customer");
        System.out.println("2.Owner");
        System.out.println("selection: ");
        int selection=keyboard.nextInt();
        //takes you to the customer side of the VM//
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



    public static void main(String[]args) {
        //create 1st version of products  which will later link to the Product class//
        int itemNumber, unitInStock, unitPrice;
        String itemName;

        int securityCode = 100101;
        //takes you to loading page//
        //load_page();//

        //initiliase array to store products//
        int end = -1;
        String products[][]=new String[10][3];//[row][column]//
        String[] newItem = {"1","Coke", "12.50"};
        end++;
        products[end] = newItem;
        for (int i = 0; i <= end; i++){
            if (products[i][0].equals("1")){
                System.out.println(products[i][1]+" "+products[i][2]);
            }
        }
        //changeC();//

    }
}