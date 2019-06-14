public class ComissionedEmployee extends Employee {

	public ComissionedEmployee(String name, double salary, double comission) {
		super(name, salary);
		this.comission = comission;
	}

	public double getComission() {
		return this.comission;
	}

	public double getTakeHomePay() {
		return this.salary + this.comission - getTax();
	}

	public double getTax() {
		return (this.salary + this.comission) / 10;
	}

}