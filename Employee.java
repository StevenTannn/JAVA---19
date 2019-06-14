public class Employee implements Taxable {
	protected String name;
	protected double salary;
	protected double comission;

	public Employee(String name, double salary) {
		this.name = name;
		validitySalary(salary);
		this.salary = salary;
	}

	public void validitySalary(double salary) {
		if (salary < 0)
			throw new RuntimeException("Salary harus besar daripada 0");
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public double getTax() {
		return salary / 10;
	}

	public double getTakeHomePay() {
		return salary - getTax();
	}
}