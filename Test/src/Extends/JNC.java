package Extends;

public class JNC extends Wine{
    /**
     * @desc �������ظ��෽��
     *        �����в����ڸ÷���������ת�ͺ󣬸����ǲ������ø÷�����
     * @param a
     * @return void
     */
    public void fun1(String a){
        System.out.println("JNC �� Fun1...");
        fun2();
    }
    
    /**
     * ������д���෽��
     * ָ������ĸ������õ���fun2ʱ���ض��ǵ��ø÷���
     */
    public void fun2(){
        System.out.println("JNC ��Fun2...");
    }
    
    public void fun3(Object obj)
    {
    	obj = null;
    }
}
