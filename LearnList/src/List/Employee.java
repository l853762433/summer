package List;

public class Employee {

			String name;
			String num;
			double salary;
			public Employee(String name,String num,double salary) {
				this.name=name;
				this.num=num;
				this.salary=salary;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getNum() {
				return num;
			}
			public void setNum(String num) {
				this.num = num;
			}
			public double getSalary() {
				return salary;
			}
			public void setSalary(double salary) {
				this.salary = salary;
			}
			@Override
			public String toString() {
				return "Employee [name=" + name + ", num=" + num + ", salary=" + salary + "]";
			}
			
}
