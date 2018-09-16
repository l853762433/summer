package TextOne;

public class Student {
		String name;
		int age;
		
		public Student(String name,int age) {
			this.name=name;
			this.age=age;
			
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
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
		public boolean equals(Object anotherobject) {
	        if(!(anotherobject instanceof Student)) {
	        	return false;
	        }
	        Student anotherStudent=(Student) anotherobject;
	        return name.equals(anotherStudent.name)&&age==anotherStudent.age;
	        		
	    }
		public int hashCode() {
			return name.hashCode()+age;
			
		}
		
		
}
