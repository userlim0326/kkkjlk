package iftest;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tab 키로 들여쓰기 {}중괄호 안에는 반드시 한칸 들여쓰기(tab)를 할 것
		// shift + tab 반대로 들여쓰기
		// ctrl + shift + f : 자동 줄 맞춤 기능
		// if(조건식 : true, false 가 출력되는 내용) {
		// 실행문;
		// }else {
		// 실행문;
		// }
		// 좌측 숫자 옆에 더블클릭하면 디버그하고 f6로 하나씩 확인 가능
		int i = 11;
		int j = 15;
		if (i > 10) {
			System.out.println("i는 10보다 크다");
		}
		
		if (j > 10) {
			System.out.println("j는 10보다 크다");
		}
		
		if (i < j) {
			String str = "i는 j보다 작습니다.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다1.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다2.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다3.";
			System.out.println(str);
		} else {
			String str = "i와 j는 같습니다.";
			System.out.println(str);
		}
		
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
