import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String burc = "";

        System.out.print("Ay giriniz: ");
        month = input.nextInt();
        System.out.print("Gun giriniz: ");
        day = input.nextInt();

        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {

            if ((month == 12) && (day >= 22 && day <= 31) || (month == 1 && day <= 21)) {
                burc = "Oglak";
            } else if ((month == 1) && (day >= 22 && day <= 31) || (month == 2 && day <= 19)) {
                burc = "Kova";
            } else if ((month == 2) && (day >= 20 && day <= 29) || (month == 3 && day <= 20)) {
                burc = "Balik";
            } else if ((month == 3) && (day >= 21 && day <= 31) || (month == 4 && day <= 20)) {
                burc = "Koc";
            } else if ((month == 4) && (day >= 21 && day <= 30) || (month == 5 && day <= 21)) {
                burc = "Boga";
            } else if ((month == 5) && (day >= 22 && day <= 31) || (month == 6 && day <= 22)) {
                burc = "Ikizler";
            } else if ((month == 6) && (day >= 23 && day <= 30) || (month == 7 && day <= 22)) {
                burc = "Yengec";
            } else if ((month == 7) && (day >= 23 && day <= 31) || (month == 8 && day <= 22)) {
                burc = "Aslan";
            } else if ((month == 8) && (day >= 23 && day <= 30) || (month == 9 && day <= 22)) {
                burc = "Basak";
            } else if ((month == 9) && (day >= 23 && day <= 31) || (month == 10 && day <= 22)) {
                burc = "Terazi";
            } else if ((month == 10) && (day >= 23 && day <= 30) || (month == 11 && day <= 21)) {
                burc = "Akrep";
            } else if ((month == 11) && (day >= 22 && day <= 31) || (month == 12 && day <= 21)) {
                burc = "Yay";
            } else {
                System.out.println("Hatali giris yaptiniz!");
            }
        } else {
            System.out.println("Hatali giris yaptiniz!");
        }
        System.out.println("Burcunuz: " + burc);
    }
}