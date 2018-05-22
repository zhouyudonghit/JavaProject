package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Ç³¿½±´
 * @author localuser
 *
 */
public class Resume implements Cloneable{
	public String name = null;
	public Integer age = null;
	public String sex = null;
	public List<String> famMem = new ArrayList<>();
	public WorkExperience work = null;
	
	public Resume(String name,ArrayList<String> famMem)
	{
		this.name = name;
		this.famMem = famMem;
		work = new WorkExperience();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPerson(String sex,int age)
	{
		this.sex = sex;
		this.age = age;
	}
	
	public void setWork(String timeArea,String company)
	{
		work.timeArea = timeArea;
		work.company = company;
	}
	
	public Resume clone()
	{
		Resume prototype = null;
		try {
			prototype = (Resume) super.clone();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return prototype;
	}

	public void dispaly()
	{
		System.out.println(this.name + " " + this.sex + " " + this.age);  
        System.out.print("Family member: ");  
        for(String elem : famMem)  
            System.out.print(elem + " ");  
        System.out.println();  
        System.out.print("Work experience: " + this.work.timeArea);  
        System.out.println(" " + this.work.company); 
	}
}
