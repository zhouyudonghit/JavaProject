package Sort;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
	private int length = 10;
	private static int DIRECTION_FROM_UP_TO_DOWN = 0;
	private static int DIRECTION_FROM_DOWN_TO_UP = 1;
	
	public void test()
	{
		int[] data = generateData();
		printArray(data);
		createMinimumHeap(data,0,DIRECTION_FROM_UP_TO_DOWN);
		printArray(data);
	}

	private int[] generateData()
	{
		int[] a = new int[length];
		Random random = new Random();
		for(int i = 0; i < length;i++)
		{
			a[i] = random.nextInt(100);
		}
		return a;
	}
	
	private void sort()
	{
		
	}
	
	/**
	 * create heap
	 * @param data
	 */
	private void createMinimumHeap(int[] data,int start,int direction)
	{
		if(start >= length || start < 0)
		{
			return;
		}
		int parent = data[start];
		int leftChild = Integer.MAX_VALUE;
		if(2*start+1 < length)
		{
			leftChild = data[2*start+1];
		}
		int rightChild = Integer.MAX_VALUE;
		if(2*start+2 < length)
		{
			rightChild = data[2*start+2];
		}
		int minimumIndex = start;
		if(parent > leftChild && 2*start+1 < length)
		{
			minimumIndex = 2*start+1;
		}
		if(rightChild < data[minimumIndex])
		{
			minimumIndex = 2*start+2;
		}
		if(minimumIndex != start)
		{
			int temp = data[minimumIndex];
			data[minimumIndex] = parent;
			data[start] = temp;
			//如果父亲节点交换了数据，需要回溯至爷爷节点
			createMinimumHeap(data,(start-1)/2,DIRECTION_FROM_DOWN_TO_UP);
		}
		if(direction == DIRECTION_FROM_UP_TO_DOWN) {
			createMinimumHeap(data,2*start+1,DIRECTION_FROM_UP_TO_DOWN);
		    createMinimumHeap(data,2*start+2,DIRECTION_FROM_UP_TO_DOWN);
		}
	}
	
	private void adjustMinimumHeap(int[] data,int start,int end)
	{
		if(start <= end)
		{
			return;
		}
		int parent = data[start];
		int leftChild = data[2*start+1];
		int rightChild = data[2*start+2];
		if(parent < leftChild && parent < rightChild)
		{
			adjustMinimumHeap(data,start+1,end);
		}else {
			if(parent > leftChild)
			{
				if(leftChild < rightChild)
				{
					
				}
			}
		}
	}
	
	private void printArray(int[] data)
	{
		for(int i = 0;i < data.length-1;i++)
		{
			System.out.print(data[i]+",");
		}
		System.out.println(data[data.length-1]);
	}
}
	