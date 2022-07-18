class rajasekhar 
{
	int age;
	String name;
	char surname;
	
	void test1()
	{
	System.out.println("here is the name you are looking for: " + name);
	}
	
	void test2()
	{
	System.out.println("here is the age of the person you are looking for: " + age);
	}
	
	void test3()
	{
	System.out.println("here is the surename of the person you are lookinn for: " + surname);
	}

}

class sundayspl
{
	public static void main(String[] args) 
	{
	rajasekhar raju = new rajasekhar();
	raju.name = "aryan";
	raju.test1();

	raju.age = 25;
	raju.test2();
	
	raju.surname = 'k';
	raju.test3();
	}
}