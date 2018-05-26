package Strategy;

public class Person {
    private String name;
    private int age;
    
    public void drive(Car car)
    {
    	System.out.print(name +"  "+ age+" �� "+" ����");
    	car.run();
    }
    
    public Person(String name,int age)
    {
    	this.name = name;
    	this.age = age;
    }
}
