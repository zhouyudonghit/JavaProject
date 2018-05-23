package CglibProxy;

/**
 * 上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象,但是有时候目标对象只是一个单独的对象,
 * 并没有实现任何的接口,这个时候就可以使用以目标对象子类的方式类实现代理.
 * 需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入pring-core-3.2.5.jar
 * @author localuser
 *
 */
public class CglibProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
