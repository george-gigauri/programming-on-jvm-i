import java.util.Scanner;
/**
 *
 *
 *    განსაზღვრეთ კლასი A შვილობილის კლასი B: დაამატეთ მთელი ტიპის y
 *    ცვლადი, 2 მეთოდი.
 *
 *
 */
public class B extends A {
    private int y;

    // Y ცვლადს ვანიჭებთ მნიშვნელობას კლავიატურიდან
    public void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Y >>>   ");
        y = scanner.nextInt();
    }

    // ვინაიდან B კლასი A კლასის შვილობილი გავხადე, შეგვიძლია ამ კლასიდან მივწვდე X ცვლადს
    // და მეთოდი 2-ის საშუალებით დავაბრუნო X და Y ცვლადების ჯამი
    public int method2B() {
        return x + y;
    }
}
