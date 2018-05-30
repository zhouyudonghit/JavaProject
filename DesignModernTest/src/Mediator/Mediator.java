package Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Person> landlordList = new ArrayList<>();
    protected List<Person> renterList = new ArrayList<>();
    
    public void registerLandlord(Person landlord)
    {
    	landlordList.add(landlord);
    }
    
    public void registerRenter(Person renter)
    {
    	renterList.add(renter);
    }
    
    public abstract void operation(Person person,String message);
}
