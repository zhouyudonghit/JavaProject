package Prototype;

public abstract class Prototype implements Cloneable{
	public Prototype clone()
	{
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		}
	}

}
