import java.util.Scanner;


public class FirstDegree {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh co vo so nghiem");
				return;
			}else {
				System.out.println("Phuong trinh vo nghiem");
				return;
			}
		}else {
			int x = -b/a;
			System.out.println("Nghiem cua phuong trinh la: x = " + x);
		}
	}
}