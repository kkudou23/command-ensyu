import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int n = 1; n < 3; n++) {
			System.out.println(n + "人目の身長(cm)を入力してください。");
			double height = Double.parseDouble(sc.nextLine());
			System.out.println(n + "人目の体重(kg)を入力してください。");
			double weight = Double.parseDouble(sc.nextLine());
			String message = null;
			System.out.println("");
			
			double bmi = weight/((height/100)*(height/100));
			bmi = (Math.floor(bmi * 100))/100;
			
			double appropriate = (height/100)*(height/100)*22;
			appropriate = (Math.floor(appropriate * 100))/100;
			
			System.out.println(n + "人目のBMIは" + bmi + "です。");
			if (bmi < 18.5) {
				message = "低体重(やせ)";
			} else if (bmi < 25) {
				message = "普通体重";
			} else if (bmi < 30) {
				message = "肥満(1度)";
			} else if (bmi < 35) {
				message = "肥満(2度)";
			} else if (bmi < 40) {
				message = "肥満(3度)";
			} else {
				message = "肥満(4度)";
			}
			System.out.println("これは" + message + "にあたります。");
			System.out.println("身長" + height + "cmの人の適正体重は約" + appropriate + "kgです(現在との差 : 約" + (weight-appropriate) + "kg)。");
			System.out.println("----------");
		}
	}
}