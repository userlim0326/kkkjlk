package cooperation;

public class Student {
	public String studentName;	//class 아래 멤버변수 3개선언
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Taxi taxi)
	{
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
