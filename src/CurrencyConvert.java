import java.util.Scanner;

public class CurrencyConvert {
    static void convertVND(double money) {
        double VND;
        double rate = 23000;
        VND = money * rate;
        System.out.println(VND+" VND");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USA:");
        double USA = input.nextDouble();
        convertVND(USA);
    }
}
