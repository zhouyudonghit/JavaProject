package Reflect;

public class Bean1 {
	private int var1;
	private String var2;
	
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	
	private void print(String s,int a)
	{
		System.out.println("String s = "+s+",int a = "+a);
	}
}
