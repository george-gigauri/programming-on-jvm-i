import java.util.Scanner;
/**
 *
 *   1. განსაზღვრეთ კლასი C: სამი მთელი ტიპის ცვლადით a, b, c; 6 მეთოდით.
 *
 */
public class C {
    private int a, b ,c;

    //  ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან
    public void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A >>>   ");
        a = scanner.nextInt();
        System.out.print("Enter B >>>   ");
        b = scanner.nextInt();
        System.out.print("Enter C >>>   ");
        c = scanner.nextInt();

        System.out.println("===  Input Done  ===");
    }

    //  აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს
    public int method2() {
        char[] char_a = String.valueOf(a).toCharArray(); // თითოეული ელემენტის ამოსაღებად გადამყავს ჩარების მასივში
        int length = char_a.length; // მასივის ზომას ვწერ ცალკე, მთელი ტიპის ცვლადში

        return Integer.parseInt(String.valueOf(char_a[length - 1])); // ჩარების მასივიდან ვიღებ სულ ბოლო ელემენტს, ვაკონვერტირებ ჯერ სთრინგში, შემდეგ ინტში და ვაბრუნებ
    }

    //  აბრუნებს b-ს მნიშვნელობის პირველ ციფრს
    public int method3() {
        char[] char_b = String.valueOf(b).toCharArray(); // თითოეული ელემენტის ამოსაღებად გადამყავს ჩარების მასივში
        return Integer.parseInt(String.valueOf(char_b[0])); // ჩარების მასივიდან ვიღებ პირველ ელემენტს, ვაკონვერტირებ ჯერ სთრინგში, შემდეგ ინტში და ვაბრუნებ
    }

    //  აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს
    public int method4() {
        char[] char_c = String.valueOf(c).toCharArray(); // თითოეული ელემენტის ამოსაღებად გადამყავს ჩარების მასივში
        int length = char_c.length; // მასივის ზომას ვწერ ცალკე, მთელი ტიპის ცვლადში

        if (length == 1) // ჯერ ვამოწმებ, მასივის ზომა თუ 1-ია, მის ციკლში გატარებას აზრი არ აქვს და პირდაპირ ვაბრუნებ
            return c;

        // თუ ზომა 1-ზე მეტია, ბუნებრივია, მისი ციკლში დატრიალება შესაძლებელია
        int summary = 0; // ციკლის გარეთ ელემენტების ჯამის შესანახად ვქმნი მთელი ტიპის ცვლადს
        for (char value : char_c) {
            int temp = Integer.parseInt(String.valueOf(value)); // დროებითი ცვლადში ვინახავ ჩარის ინტში გადაკონვერტებულ ვარიანტს, შემდეგ არითმეტიკული ოპერაციის განსახორციელებლად
            summary += temp; // ვახორციელებ არითმეტიკულ ოპერაციას, ჯამს ვუმატებ ახალ ციფრს
        }

        return summary; // ფუნქცია აბრუნებს ციფრთა ჯამს
    }

    //  ბეჭდავს მეთოდი 2-ის მნიშნველობისა და მეთოდი 3-ის მნიშვნელობის ნამრავლს
    public int method5() {
        int result = method2() * method3();  // ვინაიდან მეთოდი2 და მეთოდი3 აბრუნებს მთელ ტიპს, შეგვიძლია გამოვიყენოთ არითმეტიკული ოპერაციებისთვის
        System.out.println(result);  // პასუხს ჯერ ვბეჭდავ, შემდეგ კი ვაბრუნებ სამომავლოდ რომ გამოვიყენო
        return result;
    }

    //  ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის მნიშვნელობის ჯამს.
    public void method6() {
        System.out.println(method3() + method5());
    }
}
