import java.util.Random;
import java.util.Scanner;
/**
 *
 *   პრაქტიკული დავალება 1
 *   სახელი და გვარი:   გიორგი გიგაური
 *   E-Mail:   giorgi.gigauri.1@btu.edu.ge
 *   ჯგუფი 4
 *
 */
public class Work1 {
    public static void main(String[] args) {
        // კლასები შექმნილია და საჭიროებისამებრ შეგიძლიათ მათი
        // გამოცხადება და ინიციალიზაცია ამ ფუნქციაში
        // ინიციალიზაციის შემდეგ შეძლებთ მიწვდეთ მათ ფუნქციებს
        // და საჭიროებისამებრ გამოყენებას.



        // რაც შეეხება მესამე (4 ქულიან) დავალებას, იხილეთ ამ ხაზის შემდგომ (ქვემოთ) :)
        // a-სა და b-ს კლავიატურიდან ვანიჭებთ მნიშვნელობას
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A:   ");
        int a = scanner.nextInt();
        System.out.print("Enter B:   ");
        int b = scanner.nextInt();

        // წინასწარ ვაცხადებ მთელი ტიპის ცვლადებს
        int evenCount = 0;  // შეინახავს ლუწი რიცხვების რაოდენობას
        int oddCount = 0;   // შეინახავს კენტი რიცხვების რაოდენობას
        int sumOfEvens = 0; // შეინახავს ლუწი რიცხვების ჯამს
        int sumOfOdds = 0;  // შეინახავს კენტი რიცხვების ჯამს

        // დავაგენერირებ 40 შემთხვევით რიცხვს
        // [a; b] შუალედში
        for (int i = 0; i < 40; i++) {
            int val = new Random().nextInt(b - a) + a;
            System.out.print((i + 1) + ")  " + val + "   ");  // დაგენერირებულ რიცხვს ჯერ ვნომრავ და ვბეჭდავ

            if (val % 2 == 0) { // თუ დაგენერირებული რიცხვი ლუწია ...
                evenCount++; // ცვლადი, რომელშიც ლუწ რიცხვთა რაოდენობას ვინახავთ, გაიზრდება 1-ით
                sumOfEvens += val; // და ცვლადში, რომელშიც ლუწ რიცხვთა ჯამს ვინახავთ, ჯამს მიემატება ახალი დაგენერირებული ლუწი რიცხვი
            } else { // სხვა შემთხვევაში გაიზრდება კენტი რიცხვების რაოდენობა და ჯამი
                oddCount++;
                sumOfOdds += val;
            }
        }

        // ვბეჭდავ კენტი და ლუწი რიცხვების რაოდენობას
        System.out.println("\n==========================================");
        System.out.println("\nThere is " + evenCount + " even and " + oddCount + " odd numbers.");
        System.out.println("\n==========================================");

        // ვბეჭდავ ლუწი და კენტი რიცხვების ჯამებს
        System.out.println("\nSummary of the even numbers is " + sumOfEvens);
        System.out.println("Summary of the odd numbers is " + sumOfOdds + "\n");

        // ვსაზღვრავ, რომელია ჯამებს შორის მეტი და ნაკლები, რომ შემდეგ შუალედი განვსაზღვრო
        int max = sumOfEvens > sumOfOdds ? sumOfEvens : sumOfOdds;
        int min = sumOfEvens < sumOfOdds ? sumOfEvens : sumOfOdds;

        // ჯამებს შორის შუალედში ვაგენერირებ და ეკრანზე გამომაქვს 5 შემთხვევითი რიცხვი
        // NOTE:  რიცხვები ჯერ ინომრება.
        for (int i = 0; i < 5; i++) {
            int val = new Random().nextInt(max - min) + min;
            System.out.print((i + 1) + ")  " + val + "   ");
        }
    }
}
