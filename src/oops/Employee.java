package oops;
//reusable class
public class Employee {
	String Name;
	int EmpID;
	private int Salary;

	public void display()
	{
		System.out.println("Name of the employee: " + Name);
		System.out.println(EmpID);
		System.out.println("Salary of the employee is " + Salary);
	}
	public void SetSalary(int sal) {
		
		this.Salary = sal;
	}
	// Default cons
		public Employee() {
			
			System.out.println("Inside default cons");
		}
		
		
		// parameterized cons
		public Employee(String Name1,int EmpId1, int Salary1) {
			
			System.out.println("Inside param cons");
			
			this.Name = Name1;
			this.EmpID = EmpId1;
			this.Salary = Salary1;
					
		}


}
