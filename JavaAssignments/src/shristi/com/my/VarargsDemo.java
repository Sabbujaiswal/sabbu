package shristi.com.my;

public class VarargsDemo {
	void calcSum(String name,int...marks)
	{
		System.out.println("Name " +name);
		System.out.println("Number of subjects "+marks.length);
		int sum=0;
		for(int i:marks) {
			sum+=i;
		}
		System.out.println("Sum "+sum);
	}
	void calcSum(String name) {
		
	}
	public static void main(String[] args) {
		VarArgsDemo vargs =new VarArgsDemo();
		vargs.calcSum("Ram");
		vargs.calcSum("Tom",80);
		vargs.calcSum("john",80,90);
		vargs.calcSum("kathy",80,90,100);
		
	} {
		
	}
}
