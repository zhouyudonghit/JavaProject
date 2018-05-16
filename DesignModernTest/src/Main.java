import Builder.Director;
import Builder.ManBuilder;
import Builder.Person;
import SimpleFactory.BMW;
import SimpleFactory.Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		Person person = director.createPerson(new ManBuilder());
		System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
	}
}
