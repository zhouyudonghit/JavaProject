package ShallowAndDeepCloneTest;

public class TestBean implements Cloneable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public TestBean clone()
	{
		try {
            return (TestBean)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
}
