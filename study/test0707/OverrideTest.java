package test0707;

public class OverrideTest {

	public static void main(String[] args) {
		
		Person person1 = new Person("jeong-pro", 27);
		Person person2 = new Person("jeong-pro", 27);
		System.out.println(person1.equals(person2));//true ·Î ¹ÝÈ¯
	}
}

class Person{
	 String name;
	 int age;
	 
	 public Person(String name, int age) {
		 this.name=name;
		 this.age=age;
	}
	 
		 @Override
		public boolean equals(Object obj) {
			if (this.name == ((Person) obj).name && this.age == ((Person) obj).age )
				return true;
			else 
				return false;
		}
 }

