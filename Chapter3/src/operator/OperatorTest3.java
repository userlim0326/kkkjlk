package operator;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +=, -=, *=, /=, %= : 복합 대입 연산자
		int i = 10;
		int j = 20;
		System.out.println(i+=j); // i에 j를 더하여 i에 저장
		//i = i+j; i=30
		System.out.println(i-=j); // i에 j를 빼서 i에 저장
		// i = i-j; i = 30-20> i = 10
		System.out.println(i*=j); // i에 j를 곱하여 i에 저장
		// i = i*j; i = 10 * 20 > i = 200
		System.out.println(i/=j); // i에 j를 나누어 i에 저장
		// i = i/j; i = 200/20 > i = 10
		System.out.println(i%=j); // i에 j를 나눈 나머지를 i에 저장
		// i = i%j; i = 10%20 > 10/20 > i = 10
		System.out.println(10/20);
		
	}

}
