package Anz;

import java.io.IOException;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // validate login information customer number and pin number

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try {

                data.put(123456,8424);
                data.put(789456,1234);
                data.put(456123,1981);

                System.out.println("Welcome to the ATM Project");

                System.out.println("Enter Your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Your Pin Number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s).Only Numbers."
                        + "\n");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() ==
                getPinNumber()) getAccountType();
            }

                System.out.println("\n" + "Wrong Customer Number or Pin Number."
                        + "\n");
            }while ( x == 1 );
}

        public void getAccountType() {
            System.out.println("Select the Account you want to Access:");
            System.out.println("Type 1 - Checking Account:");
            System.out.println("Type 2 - Saving Account::");
            System.out.println("Type 3 - Exit:");
            System.out.println("Choice:");

            int selection = menuInput.nextInt();

            switch (selection) {
                case 1:
                    getChecking();
                    break;

                case 2 :
                    getSaving();
                    break;

                case 3:
                    System.out.println("Thank you for using this ATM , Bye.");
                    break;

                default:
                    System.out.println("\n" + "Invalid Choice." + "\n");
                    getAccountType();
            }
        }

    private void getChecking() {
    }

    private void getSaving(){
    }
}