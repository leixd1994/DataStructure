
class MaoPaoSort{
	static private final int ARRAY_SIZE=100;
	//static int []testData={3,5,-3,7,13,-6,-2,-7};
	static int []testData=null;

	static public void main(String []args)
		{
			testData=generateRamdomArray(testData);
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
	static int [] generateRamdomArray(int []array)
	{
		array=new int[ARRAY_SIZE];
		for (int i=0;i<ARRAY_SIZE;i++)
		{
			array[i]=(int)(Math.random()*100);
		}
		return array;
	}
}