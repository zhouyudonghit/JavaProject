package Memento;

public class Caretaker {
	private Memento memento;
	
	public Memento retrieveMemento()
	{
		return memento;
	}

	public void saveMemento(Memento memento)
	{
		this.memento = memento;
	}
}
