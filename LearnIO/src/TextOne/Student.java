package TextOne;

public class Student {
		String name;
		double language;
		double math;
		double english;
		public Student(String name ,double language,double math,double english) {
			this.name=name;
			this.language=language;
			this.math=math;
			this.english=english;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getLanguage() {
			return language;
		}
		public void setLanguage(double language) {
			this.language = language;
		}
		public double getMath() {
			return math;
		}
		public void setMath(double math) {
			this.math = math;
		}
		public double getEnglish() {
			return english;
		}
		public void setEnglish(double english) {
			this.english = english;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", language=" + language + ", math=" + math + ", english=" + english + "]";
		}
		
}
