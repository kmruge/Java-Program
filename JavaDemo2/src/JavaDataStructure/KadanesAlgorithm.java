package JavaDataStructure;
/*Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)*/
public class KadanesAlgorithm {
	long maxSubarraySum(int arr[], int n){
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result+arr[i];
        }
        if(result<0)
        {
            result=-1;;
        }
        return result;
	}

	public static void main(String[] args) {
		int Arr[] = {1,2,3,-2,5};
		int n=Arr.length;
		KadanesAlgorithm ji=new KadanesAlgorithm();
		System.out.println(ji.maxSubarraySum(Arr,n));
	}

}
