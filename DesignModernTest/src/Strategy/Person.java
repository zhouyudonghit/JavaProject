package Strategy;

public class Person {
    private String name;
    private int age;
    
    public void drive(Car car)
    {
    	System.out.print(name +"  "+ age+" Ëê "+" ¿ª×Å");
    	car.run();
    }
    
    public Person(String name,int age)
    {
    	this.name = name;
    	this.age = age;
    }
}
