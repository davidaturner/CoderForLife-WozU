
public class Teacher extends BasePerson {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Tim Boyd", 35, "Geometry");
		teacher.sayHello();

	}

	@Override
	public void sayHello() {
      System.out.println("Hello, my name is Mr. " + this.getName() + ", and I teach " + this.subject + ".");	
	}

}
