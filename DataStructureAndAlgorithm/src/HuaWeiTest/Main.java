package HuaWeiTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] names = str.split(",");
		if(names == null || names.length <= 0 || names.length >= 100)
		{
			System.out.println("error.0001");
			return;
		}
		List<String> nameList = new ArrayList(Arrays.asList(names));
		if(checkNames(nameList))
		{
			Collections.sort(nameList);
			int count = 1;
			int lastCount = 1;
			String currentName = nameList.get(0);
			String targetName = "";
			for(int i = 1; i < nameList.size();i++)
			{
				if(nameList.get(i).compareTo(currentName) == 0)
				{
					count++;
				}else {
					if(count > lastCount)
					{
						lastCount = count;
					}
					count = 1;
					currentName = nameList.get(i);
				}
			}
			if(count > lastCount)
			{
				lastCount = count;
			}
			count = 1;
			currentName = nameList.get(0);
			for(int i = 1; i < nameList.size();i++)
			{
				if(nameList.get(i).compareTo(currentName) == 0)
				{
					count++;
				}else {
					if(count == lastCount)
					{
						targetName = nameList.get(i-1);
						break;
					}
					count = 1;
					currentName = nameList.get(i);
				}
			}
			if(count == lastCount && targetName.equals(""))
			{
				targetName = nameList.get(nameList.size()-1);
			}
			System.out.println(targetName);
			
		}else {
			System.out.println("error.0001");
		}
	}
	
	private static boolean checkNames(List<String> names)
	{
		boolean checked = true;
		for(String name : names)
		{
			if(name == null || name.length() == 0)
			{
				checked = false;
				break;
			}else {
				if(name.charAt(0) < 'A' || name.charAt(0) > 'Z')
				{
					checked = false;
					break;
				}else {
					for(int i = 1;i < name.length();i++)
					{
						if(name.charAt(i) < 'a' || name.charAt(i) > 'z')
						{
							checked = false;
							break;
						}
					}
				}
			}
		}
		return checked;
	}

}
