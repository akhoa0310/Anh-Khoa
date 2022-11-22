import java.util.Scanner;
import java.lang.Math;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        double a, b, c, delta;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap a: ");
        a = input.nextDouble();
        System.out.println("Nhap b: ");
        b = input.nextDouble();
        System.out.println("Nhap c: ");
        c = input.nextDouble();

        delta = b * b - 4 * a * c;

        double x = -b / 2 * a;
        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        double x2 = (-b + Math.sqrt(delta)) / 2 * a;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep la: " + x);
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet la: x1 = " + x1 + " va x2 = " + x2);
        }
    }
}