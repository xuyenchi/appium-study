package javaOOP_lession06_company;

public class NormalEmployee extends Employee {

	public NormalEmployee(String id, String name, String address, double workingDay, double rangeSalary, double overtime) {
		super(id, name, address, workingDay, rangeSalary, overtime);

	}

	@Override
	public void showInfo() {
		System.out.println("-----Normal Employee Info-----");
		super.showInfo();
	}

}
