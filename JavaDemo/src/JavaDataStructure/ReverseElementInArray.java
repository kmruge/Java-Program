package JavaDataStructure;

import java.util.Arrays;

public class ReverseElementInArray {
	public static void main(String[] args) {
		int a[]= {8,2,4,6,2,3};
		int ini=0;
		int last=a.length-1;
		while(ini<last)
		{
			int b=a[ini];
			a[ini]=a[last];
			a[last]=b;
			ini++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}

}
