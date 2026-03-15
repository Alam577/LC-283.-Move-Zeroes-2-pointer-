class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            int j=i+1;
            int min=Math.min(nums[i],nums[j]);
             sum+=min;

        }return sum;
        
    }
}
public class ArrPart
{
    public static void main(String args[])
    {
        Solution sn=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i =0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result =sn.arrayPairSum(nums);
        System.out.println(result);

    }
}
