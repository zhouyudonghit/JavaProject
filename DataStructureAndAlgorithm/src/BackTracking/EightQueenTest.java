package BackTracking;

/**
 * @author Administrator
 *八皇后算法，包括递归和迭代算法
 *经验证，递归算法比迭代算法要高，因为递归算法方便剪枝，但是迭代算法不能剪枝，其实回溯算法无所谓迭代算法，因为这只是遍历，无所谓用到什么中间结果，如果
 *非得说要用到中间结果，递归算法反而更容易利用中间结果
 */
public class EightQueenTest {
	private int[] indexes = new int[8];
	private int count = 0;
	
	public void testDigui()
	{
		back_tracking_digui(0);
		System.out.println("count = " + count);
	}
	
	private void back_tracking_digui(int n)
	{
		System.out.println("n = " + n);
		if(n == 7)
		{
			for(int i = 0;i < 8;i++)
			{
				indexes[n] = i;
				if(is_ok(n))
				{
					count++;
				}
			}
			return;
		}
		for(int i = 0;i < 8;i++)
		{
			indexes[n] = i;
			if(is_ok(n))
			{
				back_tracking_digui(n+1);
			}
		}
	}
	
	private boolean is_ok(int length)
	{
		boolean is_ok = true;
		for(int i = 0;i < length;i++)
		{
			if(indexes[length] == indexes[i] || length-indexes[length] == i - indexes[i] || length+indexes[length] == indexes[i]+i)
			{
				is_ok = false;
				break;
			}
		}
		return is_ok;
	}
	
	private int[] stages = {1,1,1,1,1,1,1,1};
	public void testDiedai()
	{
		for(int i = 0;i < 8;i++)
		{
			for(int k = 0;k < 8;k++)
			{
				if( k <= i)
				{
					stages[k] *= 8;
				}
			}
		}
		int i = 0;
		while(i < stages[0])
		{
			System.out.println("i = "+i);
			int state = findState(i);
			for(int j = state;j < 8;j++)
			{
				indexes[j] = i%stages[j];
			}
			boolean ok = true;
			for(int m = 0;m < 8;m++)
			{
				if(!is_ok(m))
				{
					ok = false;
					break;
				}
			}
			if(ok)
			{
			    count++;
			}
			i++;
		}
		System.out.print("count = "+count);
	}
	
	private int findState(int number)
	{
		int state = 7;
		for(int i = 7;i >= 0;i--)
		{
			if(number < stages[i])
			{
				state =  i;
			}
		}
		return state;
	}
}
