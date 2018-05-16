package SingleInstance;

/**
 * 私有静态内部类
 * @author localuser
 *
 */
public class SingleInstanceTest2 {
   private SingleInstanceTest2(){
	   
   }
   
   private static class InnerClass{
	   private static final SingleInstanceTest2 instance = new SingleInstanceTest2();
   }
   
   public static SingleInstanceTest2 getInstance()
   {
	   
	   return InnerClass.instance;
   }
}
