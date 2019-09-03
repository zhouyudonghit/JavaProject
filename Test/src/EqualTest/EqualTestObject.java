package EqualTest;

public class EqualTestObject {
	@Override
	public boolean equals(Object obj) {
        return (this == obj);
    }
	
	@Override
	public int hashCode()
	{
		return 0;
	}

}
