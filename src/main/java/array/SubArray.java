package problems;
import java.util.Scanner;

public class SubArray {
	 
		 int subArraySum(int arr[], int n, int sum) 
		    {
		        int curr_sum = arr[0], start = 0, i, end=0;
		        int val=0;
		 
		        // Pick a starting point
		        for (i = 1; i < n; i++) 
		        {   
		            if(curr_sum<sum){
		                curr_sum=curr_sum+arr[i];
		            }else
		            if(curr_sum==sum) {
		            	end=i-1;
		                break;
		            }
		            else{
		                if(start<n){
		               curr_sum=curr_sum- arr[start];
		               start++;
		                }
		               
		               if(curr_sum>sum){
		            	   --i;  
		               }else 
		            	   if(curr_sum<sum) {
		            		   curr_sum=curr_sum+arr[i]; 
		            	   }
		            	   else {
		            		  --i;
		            		  end=i;
		            		   break;
		            	   }
		            }
		            if(i==(n-1)&&curr_sum>sum)
		            	--i;
		            
		        }
		        if(curr_sum==sum){
		             System.out.println((start+1)+" "+(end+1));
	             val=1;
	         }else{
	         	val=-1;
	         	 System.out.println(val);
	         }
		        return val;
		    }
		 
		    public static void main(String[] args) 
		    {
		    	SubArray arraysum = new SubArray();
		    	Scanner sc=new Scanner(System.in); 
		    	int testcase =Integer.parseInt(sc.nextLine()) ;
		    	for(int i=0;i<testcase;i++){
		    	   String s[] = sc.nextLine().split(" ");
		    	   int n=Integer.parseInt(s[0]);
		    	   int sum = Integer.parseInt(s[1]);
		    	   String array[] = sc.nextLine().split(" ");
		    	   int arr[]=new int[array.length];
		    	   for(int j=0;j<array.length;j++){
		    	       arr[j]=Integer.parseInt(array[j]);
		    	   }
		    	    arraysum.subArraySum(arr, n, sum);
		    	}
		    }
		 
}
