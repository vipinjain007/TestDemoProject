
public class MyFirstClass {
//    private int id;
	private int Age;
	private String Name;
	private String City;
	
	public MyFirstClass() {
//	this.id = id;
	}
	
	public void setage(int age) {
		this.Age =age;
	}
	public void setname(String name) {
		this.Name = name;
	}
	public void setcity(String city) {
		this.City=city;
	}
	public void showAllInfo() {
		System.out.println("Age:"+Age);
		System.out.println("Name:" + Name);
		System.out.println("City:" + City);
	}
}

