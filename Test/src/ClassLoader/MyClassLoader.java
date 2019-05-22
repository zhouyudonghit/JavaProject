package ClassLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader{
	public Class<?> findClass(String name)
	{
		byte[] bt = loadClassData(name);
		return defineClass(name,bt,0,bt.length);
//		return loadClassDataFromFile(name);
	}
	
	private byte[] loadClassData(String className)
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream(className.replace(".", "/")+".class");
		System.out.println("Loaded by 2:" + getClass().getClassLoader());
		ByteArrayOutputStream byteSt = new ByteArrayOutputStream();
		int len = 0;
		try {
			while((len = is.read()) != -1)
			{
				byteSt.write(len);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return byteSt.toByteArray();
	}
	
	private Class<?> loadClassDataFromFile(String name)
	{
		//String myPath = "file:///Users/yudongzhou/Desktop/" + name.replace(".","/") + ".class";
		String myPath = "C:\\Users\\yudongzhou\\Desktop\\HighRichHandsome.class";
        System.out.println(myPath);
        byte[] cLassBytes = null;
        File file = new File(myPath);
        int len = 0;
        try {
			InputStream is = new FileInputStream(file);
			ByteArrayOutputStream byteSt = new ByteArrayOutputStream();
			while((len = is.read()) != -1)
			{
				byteSt.write(len);
			}
			cLassBytes = byteSt.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Class clazz = defineClass(name, cLassBytes, 0, cLassBytes.length);
        return clazz;
	}
}
