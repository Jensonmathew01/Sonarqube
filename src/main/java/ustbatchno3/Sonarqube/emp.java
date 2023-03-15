package ustbatchno3.Sonarqube;

public class emp {
	private String name;
	private int age;
	private int n;
	private double salary;
	public emp(String name, int age, int n, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.n = n;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", age=" + age + ", n=" + n + ", salary=" + salary + "]";
	}
	

}
