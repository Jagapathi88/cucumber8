package Practice;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,4,7,5,67,23,2};
		int k=4;
		   while(k>0) {
			for(int i=0;i<a.length-1;i++)
			{
				int n=0;
				if(a[i]<a[i+1])
				{
					n=a[i];
					a[i]=a[i+1];
					a[i+1]=n;
				}
				
			}
			k--;
		   }
			for(int b:a)
			{
				System.out.println(b);
			}
		
	}

}
