package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	public void test()
	{
		try {
			Class class1 = Class.forName("Reflect.Bean1");
			Class class2 = Bean1.class;
		    Class class3 = new Bean1().getClass();
			for(Field field:class1.getDeclaredFields())
			{
				System.out.println(field.toString());
			}
			
			Method method;
			try {
				method = class1.getMethod("getVar1",null);
				System.out.println(method.toString());
				System.out.println(method.invoke(new Bean1(), null));
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test2()
	{
		Bean1 bean1 = new Bean1();
		Class class1 = bean1.getClass();
		try {
			Method method = class1.getDeclaredMethod("print", String.class,Integer.class);
			method.setAccessible(true);
			method.invoke(bean1, "string",9);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
