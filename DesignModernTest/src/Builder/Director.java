package Builder;

public class Director {
    public Person createPerson(Builder builder)
    {
    	builder.buildBody();
    	builder.buildHead();
    	builder.buildFoot();
    	return builder.buildPerson();
    }
}
