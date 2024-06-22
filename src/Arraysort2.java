import java.util.*;
public class Arraysort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {23,11,24,78,90};
		int p[]= {2,6,9,10,67};
		System.out.println("index of 8 is"+Arrays.binarySearch(p, 9));
		Arrays.fill(p, 0,3,-1);
		for(int i=0; i<=p.length;i++)
		{
			System.out.println(p[i]);
		}
		Arrays.parallelSort(x);
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}
