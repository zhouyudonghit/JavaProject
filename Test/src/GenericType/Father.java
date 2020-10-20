package GenericType;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Father<T> {
	public Father()
	{
		System.out.println(getClass());
		System.out.println(getClass().getGenericSuperclass());
		getSuperclassTypeParameter(this.getClass());
	}
	
	static void getSuperclassTypeParameter(Class<?> subclass) {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        } else {
            ParameterizedType parameterized = (ParameterizedType)superclass;
//            return Types.canonicalize(parameterized.getActualTypeArguments()[0]);
        }
    }
	
	public void door(T...ts )
	{
		test(ts);
	}
	
	public void test(T... t)
	{
		System.out.println("father.tetst");
	}
}
