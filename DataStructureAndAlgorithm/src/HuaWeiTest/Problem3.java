package HuaWeiTest;

/**
 * 约瑟夫环问题
已知 100 围坐在一张圆桌周围。从编号为 1 的人开始报数，数到 m 的那个人出列；
他的下一个人又从 1 开始报数，数到 m 的那个人又出列；依此规律重复下去，
直到圆桌周围的人少于 m 个数，输出圆桌上人的原始编号。
 * @author apple
 *
 */
public class Problem3 implements ITest{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		int totalNumber = 4;
		int m = 3;
		int[] deleteIndeies = new int[totalNumber/m];
		int[] people = new int[totalNumber];
		initPepleArray(people,totalNumber);
		int restNumber = totalNumber;
		int currentIndex = 1;
		while(restNumber >= m)
		{
			int j = -1;
			for(int i = 0; i < restNumber;i++)
			{
				if(currentIndex == m)
				{
					deleteIndeies[++j] = i;
					currentIndex = 1;
				}else {
					currentIndex++;
				}
			}
			if(j == -1)
			{
				break;
			}else {
				int k = 0;
				for(;k < j;k++)
				{
					System.arraycopy(people, deleteIndeies[k]+1, people, deleteIndeies[k]-k, m-1);
				}
				if(deleteIndeies[k] <= restNumber - 1)
				{
					System.arraycopy(people, deleteIndeies[k]+1, people, deleteIndeies[k]-k, restNumber - 1 - deleteIndeies[k]);
				}
				restNumber = restNumber - j - 1;
			}
		}
		for(int i = 0;i < restNumber;i++)
		{
			System.out.print(people[i] + ",");
		}
	}
	
	private void initPepleArray(int[] people,int length)
	{
		for(int i = 1;i <= length;i++)
		{
			people[i-1] = i;
		}
	}
	 
}
