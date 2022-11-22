import java.util.Scanner;
import java.lang.Math;

public class tinhtonghieu {
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap a:");
        a = input.nextDouble();
        System.out.println("Nhap b:");
        b = input.nextDouble();

        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
        System.out.println("tong 2 so la" + tong);
        System.out.println("hieu 2 so la" + hieu);
        System.out.println("tich 2 so la" + tich);
        System.out.println("thuong 2 so la" + thuong);
    }
}