
//There are a few things to note when differentiating abstract and interface classes.
//
//1. The keyword interface is used to declare interfaces, while the keyword abstract 
//is used to define abstract classes.
//
//2. Interfaces can only contain abstract methods, while abstract classes can contain 
//a mix of abstract and non-abstract methods. Although the methods in the interfaces 
//don't explicitly have abstract prepended to them, all methods in interfaces are abstract.
//
//3. Interfaces can inherit from multiple classes (multiple-inheritance), while 
//	abstract cannot.
//
//4. Interfaces cannot provide implementation, while an abstract class can.
//
//5. Interfaces can only contain final and static variables, while an abstract can 
//contain final, non-final, static, and non-static variables.

public abstract class BasePerson {

    private String name;
	private int age;

    public BasePerson(String name, int age){
        this.name = name;
        this.age = age;
    }

//    public void sayHello(){
//        System.out.println("Hello, my name is " + this.name);
//    }

    public abstract void sayHello();
    
    public String getName() {
		return name;
	}
    
    public int getAge(){
        return this.age;
    }
}
