import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("一人目の身長(cm)を入力してください。");
		double heightA = Double.parseDouble(sc.nextLine());
		System.out.println("一人目の体重(kg)を入力してください。");
		double weightA = Double.parseDouble(sc.nextLine());
		double bmiA = weightA/((heightA/100)*(heightA/100));
		double appropriateA = (heightA/100)*(heightA/100)*22;
		String messageA = null;
		
		System.out.println("----------");
		
		System.out.println("二人目の身長(cm)を入力してください。");
		double heightB = Double.parseDouble(sc.nextLine());
		System.out.println("二人目の体重(kg)を入力してください。");
		double weightB = Double.parseDouble(sc.nextLine());
		double bmiB = weightB/((heightB/100)*(heightB/100));
		double appropriateB = (heightB/100)*(heightB/100)*22;
		String messageB = null;
		
		System.out.println("----------");
		
		System.out.println("一人目のBMIは" + String.format("%.2f", bmiA) + "です。");
		if (bmiA < 18.5) {
			messageA = "低体重(やせ)";
		} else if (bmiA < 25) {
			messageA = "普通体重";
		} else if (bmiA < 30) {
			messageA = "肥満(1度)";
		} else if (bmiA < 35) {
			messageA = "肥満(2度)";
		} else if (bmiA < 40) {
			messageA = "肥満(3度)";
		} else {
			messageA = "肥満(4度)";
		}
		System.out.println("これは" + messageA + "にあたります。");
		System.out.println("身長" + heightA + "cmの人の適正体重は約" + String.format("%.2f", appropriateA) + "kgです。");
		
		System.out.println("----------");
		
		System.out.println("二人目のBMIは" + String.format("%.2f", bmiB) + "です。");
		if (bmiB < 18.5) {
			messageB = "低体重(やせ)";
		} else if (bmiB < 25) {
			messageB = "普通体重";
		} else if (bmiB < 30) {
			messageB = "肥満(1度)";
		} else if (bmiB < 35) {
			messageB = "肥満(2度)";
		} else if (bmiB < 40) {
			messageB = "肥満(3度)";
		} else {
			messageB = "肥満(4度)";
		}
		System.out.println("これは" + messageB + "にあたります。");
		System.out.println("身長" + heightB + "cmの人の適正体重は約" + String.format("%.2f", appropriateB) + "kgです。");
	
	}
}