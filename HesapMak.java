import java.util.Scanner;
public class HesapMak {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Ilk sayi:");
        a = sc.nextDouble();
        System.out.println("Ikinci sayi:");
        b = sc.nextDouble();
        char islem;
        System.out.println("Hangi islem seciniz(+,-,/,*)");
        islem = sc.next().charAt(0);
        switch(islem)
        {
            case '+': System.out.println("Sonuc:" +(a+b));break;
            case '-': System.out.println("Sonuc:" +(a-b));break;
            case '*': System.out.println("Sonuc:" +(a*b));break;
            case '/': System.out.println("Sonuc:" +(a/b));break;
            default: System.out.println("Dev");
        }
    }
}