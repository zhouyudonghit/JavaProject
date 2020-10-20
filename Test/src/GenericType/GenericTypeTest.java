package GenericType;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

public class GenericTypeTest {
//	public void test1()
//	{
//		List<? extends Object> list = new ArrayList<>();
//		List<String> list2 = new ArrayList<>();
//		list = list2;
//		list2.add("2");
//		List<Integer> list3 = new ArrayList<>();
//		list3.add(4);
//		List list4 = list3;
//		list4.addAll(list2);
//		
//		ArrayList<String> list5 = new ArrayList<>();
//		list5.add("5");
//		list5 = (ArrayList<String>) list5.subList(0, 1);
//		
//		System.out.println(list4);
//	}
//	
//	public <T> void test2(T t)
//	{
//		
//	}
//	
//	public void test3()
//	{
////		Father f = new Son();
////		f.door();
//		
//		Father f2 = new Father<String>() {
//			public void test(String...stri)
//			{
//				//System.out.println(x);
//			}
//		};
//		f2.door();
//	}
//	
//	<T> T getObject()
//	{
//		String s = "1";
//		return (T)s;
//	}
//	
//	public void test4()
//	{
//		System.out.println(Father.class);
//		Father<String> father = new Father<>();
//		System.out.print(father.getClass());
//		double d = 0d;
//		List<Double> list = new ArrayList<>();
//		list.add(d);
//	}
	
//	public <T> T test5(T x,T y)
//	{
//		return y;
//	}
	
	public void test5(Integer f)
	{
		
	}
	
	public void test5(Object f)
	{
		
	}
	
	public <T> void test5(T x,T y)
	{
		return ;
	}

	public void test6()
	{
//		System.out.println(Son.class.getGenericSuperclass());
//		System.out.println(Son.class.getSuperclass());
//		System.out.println(Father.class.getGenericSuperclass());
//		System.out.println(Father.class.getSuperclass());
//		System.out.println(Integer.class.getGenericSuperclass());
//		System.out.println(Integer.class.getSuperclass());
//		ParameterizedType parameterizedType = (ParameterizedType) Son.class.getGenericSuperclass();
//		ParameterizedTypeImpl i;
//		System.out.println(parameterizedType.getClass().getName());
//		System.out.println(parameterizedType);
//		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//		for(Type actualTypeArgument: actualTypeArguments) {
//			System.out.println(actualTypeArgument.getClass().getName());
//		    System.out.println(actualTypeArgument);
//		} 
//		
//		ParameterizedType parameterizedType = (ParameterizedType) Son.class.getGenericInterfaces()[0];
//		System.out.println(parameterizedType.getClass().getName());
//		System.out.println(parameterizedType);
//		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//		for(Type actualTypeArgument: actualTypeArguments) { 
//			System.out.println(actualTypeArgument.getClass().getName());
//		    System.out.println(actualTypeArgument); 
//		} 
		
		
//		Father<Integer> father = new Father<Integer>();
//		System.out.println(new Father<Integer>() {}.toString());
		System.out.println(new Father<Integer>() {}.getClass().getGenericSuperclass());
		System.out.println((new ITest<Integer>() {}.getClass().getGenericInterfaces())[0]);
//		ParameterizedType parameterizedType = (ParameterizedType) father.getClass();
//		System.out.println(parameterizedType);
//		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//		for(Type actualTypeArgument: actualTypeArguments) {  
//		    System.out.println(actualTypeArgument); 
//		}
	}
	
}
