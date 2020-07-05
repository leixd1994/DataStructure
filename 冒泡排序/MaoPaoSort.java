class MaoPaoSort{
	static int []testData={3,5,-3,7,13,-6,-2,-7};
	static public void main(String []args)
		{
			sort(testData);
			printArray(testData);		
		} 
	static void sort(int []array)
		{
			int length=array.length;
			for (int i=0;i<length;i++)
				for (int j=0;j<length-1;j++)
					{
						if (array[j]<array[j+1])    //如果前面的元素小于后面的元素，进行交换
							{
								int temp=array[j];array[j]=array[j+1];array[j+1]=temp;
							}					
					}
		}
	static void printArray(int []array)
		{
			for (int t:array)
				System.out.println(t);
		}
}