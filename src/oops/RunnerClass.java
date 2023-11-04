package oops;

public class RunnerClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.EmpID = 1;
		e1.Name = "Kaviya";
		e1.SetSalary(50000);
		
		Employee e2 = new Employee();
		e2.EmpID = 1;
		e2.Name = "Arun";
		e2.SetSalary(750000);
		
		Employee e3 = new Employee("Rohini",102,80000);

		
		e1.display();
		e2.display();
		e3.display();
	}

}
