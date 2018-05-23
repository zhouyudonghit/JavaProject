package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
    private Object object;
    
    public DynamicProxy(Object object)
    {
    	this.object = object;
    }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("begin invoke");
		Object result = method.invoke(object, args);
		System.out.println("end invoke");
		return result;
	}

}
