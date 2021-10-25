import java.util.Scanner;
public class new_moneyCAL {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String itemName;
        int qtyOfItems,AmountTendered;
        double change,twenties,tens,fives,ones,fiftyCent,tenCents, fiveCents,pricePerI;
        //System.out.println("Enter item name: ");
        itemName=input.nextLine();
        //System.out.println("Enter QTY of Apples:");
        qtyOfItems=input.nextInt();
        //System.out.println("Enter price per item N$:");
        pricePerI=input.nextDouble();
        //System.out.println("Amount tendered N$:");
        AmountTendered=input.nextInt();

        double amountToBePaid;
        amountToBePaid=qtyOfItems*pricePerI;

        change=AmountTendered-amountToBePaid;
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


        System.out.print(" Your change is:N$ ");
        System.out.printf("%6.2f", ogChange);
        System.out.println(" ");
        System.out.println(
                "Disbursed as follows: "+(int)twenties+" x N$20; "
                        +(int)tens+" x N$10; "
                        +(int)fives+" x N$5; "
                        +(int)ones+" x N$1; "
                        + (int)fiftyCent +" x 50c; "
                        +(int)tenCents+" x 10c; "
                        +fiveCentRound+" x 5c");
    }
}