package joanna;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public  static void main(String[] args){
        final byte months_in_year = 12;
        final byte percent = 100;
        int principal, numberOfPayments;
        float monthlyInt;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInt = scanner.nextFloat();
            if (annualInt > 0 && annualInt < 30) {
                monthlyInt = annualInt / percent / months_in_year;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than 30");
        }

        while (true){
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * months_in_year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }



        double mortgage = principal * (monthlyInt * Math.pow(1 + monthlyInt, numberOfPayments)) / (Math.pow(1 + monthlyInt, numberOfPayments) -1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);

    }


}
