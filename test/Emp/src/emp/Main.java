package emp;

 class Emp {
	String name;
	int id;
	double sal;
	String address;
	
	Emp(String name, int id, double sal, String address){
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;	
	}
	
	Emp(){
		
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
}

class  Main{
	public static void main(String[] args) {
		Emp emp = new Emp("rahul", 211, 259700, "Mumbai");
		System.out.println(emp);
		Emp emp2 = new Emp();
		emp2.name = "Naik";
		emp2.id = 1;
		emp2.sal = 30000;
		emp2.address = "Kandivali";
		System.out.println(emp2);
		
	}
}
