
public class Student extends BasePerson {

    private String subject;

    public Student(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Tim Boyd", 35, "Geometry");
		teacher.sayHello();

		Student student = new Student("Tina Boyd", 16, "Geometry");
		student.sayHello();

	}

	@Override
	public void sayHello() {
      System.out.println("Hello, my name is " + this.getName() + ", and I take "  + this.subject + ".");	
	}

}
