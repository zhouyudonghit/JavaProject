package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {
	
	//ά��һ��Ŀ�����
    private Object target;
    public DynamicProxyFactory(Object target){
        this.target=target;
    }

   //��Ŀ��������ɴ������
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("��ʼ����2");
                        //ִ��Ŀ����󷽷�
                        Object returnValue = method.invoke(target, args);
                        System.out.println("�ύ����2");
                        return returnValue;
                    }
                }
        );
    }
}
