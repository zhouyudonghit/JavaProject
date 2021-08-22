package HuaWeiTest;

/**
 * 给你一个正整数n，假设有两个质数加起来等于n,问一共有多少组这样的质数？
 * @author apple
 *
 */
public class Problem1 {
	public void test()
	{
		int n = 30;
		int count = 0;
		for( int i = 2;i <= n/2;i++)
		{
			if(isPrime(i) && isPrime(n - i))
			{
				System.out.println("i = "+i+",n -i = "+(n-i));
				count++;
			}
		}
		System.out.println("count = "+count);
	}
	
	private boolean isPrime(int n)
	{
		if(n < 2)
		{
			return false;
		}
		boolean prime = true;
		int h = (int) (Math.sqrt(n));
		for(int i = 2; i <= h;i++)
		{
			if(n % i == 0)
			{
				prime = false;
				break;
			}
		}
		return prime;
	}
}
