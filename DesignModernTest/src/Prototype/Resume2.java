package Prototype;

import java.util.ArrayList;

/**
 * ���
 * @author localuser
 *
 */
public class Resume2 implements Cloneable{

	public String name = null;  
    public int age = 0;  
    public String sex = null;  
    public ArrayList<String> famMem = new ArrayList<>();  
    public WorkExperience work = null;  
      
    public Resume2(String name, ArrayList<String> famMem) {  
        this.name = name;  
        this.famMem = famMem;  
        work = new WorkExperience();  
    }// Resume  
      
    public void setName(String name) {  
        this.name = name;  
    }// setName  
      
    public void setPersonal(String sex, int age) {  
        this.age = age;  
        this.sex = sex;  
    }// setPersonal  
  
    public void setWork(String timeArea, String company) {  
        work.timeArea = timeArea;  
        work.company = company;  
    }// setWork  
      
    /** 
     * ��Щclone()����Ϊpublic���ͣ�Ϊÿ���ֶζ������µĶ�����ʵ��������ܡ� 
     */  
    @Override  
    public Resume2 clone() {      
        ArrayList<String> famMem = new ArrayList<>(this.famMem);  
        Resume2 copy = new Resume2(name, famMem);   
        copy.setPersonal(sex, age);  
        copy.setWork(this.work.timeArea, this.work.company);  
        return copy;  
    }// clone  
      
    public void display() {  
        System.out.println(this.name + " " + this.sex + " " + this.age);  
        System.out.print("Family member: ");  
        for(String elem : famMem)  
            System.out.print(elem + " ");  
        System.out.println();  
        System.out.print("Work experience: " + this.work.timeArea);  
        System.out.println(" " + this.work.company);  
    }// display  
}
