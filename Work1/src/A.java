import java.util.Scanner;

/**
 *
 *   2. განსაზღვრეთ კლასი A: მთელი ტიპის x ცვლადით. კონსტრუქტორით, 3 მეთოდით.
 *
 */
public class A {
    protected int x;

    // კლასის მთავარი კონსტრუქტორი, რომელიც ბეჭდავს Hello-ს
    public A() {
        System.out.println("Hello");
    }

    // მეთოდი1: X ცვლადში კლავიატურიდან შეგვაქვს მნიშვნელობა
    public void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X >>>   ");
        x = scanner.nextInt();
    }

    // ვბეჭდავთ X + 12
    public void method2() {
        System.out.println(x + 12);
    }

    // ვადგენთ ცვლადი ლუწია თუ კენტი
    public boolean method3() {
        return x % 2 == 0;  // თუ ლუწია, დააბრუნებს true, სხვა შემთხვევაში false
    }
}
