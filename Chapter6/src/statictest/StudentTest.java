package statictest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		System.out.println(lee.serialNum); //int.serialNum이 1000으로 설정되어서 1000
		lee.serialNum++;
		
		Student kim = new Student();
		System.out.println(kim.serialNum);
		kim.serialNum++;
		
		System.out.println(Student.serialNum);//class Student를 직접적으로 부른것 >>이 방식을 권유
		Student.showInfo2();
	}

}
