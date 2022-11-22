import java.util.Scanner;

public class FirstDegreeSystem {
	public static void main(String[] args) {
		double a11,a12,b1,a21,a22,b2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a11: ");
		a11 = input.nextDouble();
		System.out.println("Enter a11: ");
		a12 = input.nextDouble();
		System.out.println("Enter b1: ");
		b1 = input.nextDouble();
		System.out.println("Enter a21: ");
		a21 = input.nextDouble();
		System.out.println("Enter a22: ");
		a22 = input.nextDouble();
		System.out.println("Enter b2: ");
		b2 = input.nextDouble();
		
		if(a11 == 0 && a21 != 0) {
			if(a12 - b1 != 0) {
				System.out.println("He phuong trinh vo nghiem");
			}
			else {
				System.out.println("He phuong trinh vo so nghiem x1 va x2 = " + (b2-a22)/a21);
			}
		}
		else if(a11 != 0 && a21 == 0) {
			if(a22 - b2 != 0) {
				System.out.println("He phuong trinh vo nghiem");
			}
			else {
				System.out.println("He phuong trinh vo so nghiem x2 va x1 = " + (b1-a12)/a11);
			}
		}
		else if(a11 ==0 && a21 == 0) {
			if(a21-b1 == 0 && a22 - b2 ==0) {
				System.out.println("He phuong trinh vo so cap nghiem (x1,x2) ");
			}else {
				System.out.println("He phuong trinh vo nghiem x2 va x1 = ");
			}
		}
		else {
			System.out.println("He phuong trinh co 2 nghiem la: " + "x1 = " + (b1-a12)/a11 + " va x2 = " + (b2-a22)/a21);;
		}
	}
}
