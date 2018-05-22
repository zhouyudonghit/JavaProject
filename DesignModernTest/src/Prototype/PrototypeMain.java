package Prototype;

import java.util.ArrayList;

public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> famMem = new ArrayList<>();
		famMem.add("Papa");
		famMem.add("Mama");
		
		Resume2 resume1 = new Resume2("Jobs",famMem);
		resume1.setPersonal("Male", 26);
		resume1.setWork("2013/8/1 - 2015/6/30", "Huawei");  
		
		// 通过简历1复制出简历2，并对家庭成员和工作经验进行修改  
        Resume2 resume2 = resume1.clone();  
        resume2.setName("Tom");  
        resume2.setPersonal("Female", 28);
        resume2.famMem.add("Brother");  
        resume2.setWork("2015/7/1 - 2016/6/30", "Baidu");  
        
        resume1.display();
        resume2.display();
        
        String str = "test";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
	}

}
