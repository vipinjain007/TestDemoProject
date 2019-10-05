
public class MySecondClass {

	public static void main (String[]args) {
		System.out.println("student info");
		
		MyFirstClass mfclass = new MyFirstClass();
		mfclass.setage(10);
		mfclass.setname("Upasana");
		mfclass.setcity("Ahmedabad");
		mfclass.showAllInfo();
		
}
	MyFirstClass mfclass1=new MyFirstClass();{
	mfclass1.setage(10);
	mfclass1.setname("Kajal");
	mfclass1.setcity("Anand");
	mfclass1.showAllInfo();
	
	}
	MyFirstClass mfclass2=new MyFirstClass();{
		mfclass2.setage(11);
		mfclass2.setname("Himali");
		mfclass2.setname("Vadodara");
		mfclass2.showAllInfo();
	}
}
