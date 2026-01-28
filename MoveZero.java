// 283. Move Zeroes (2 pointer)
class mz{

public mz(int arr[])
    {
        int right=0;
        for(int left=0;left<arr.length;left++)
        {
            if(arr[left]!=0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right++;
            }
        }
            for(int i:arr)
    {
                 System.out.print(i+" ");

    }
    }
}
class MoveZero{
    public static void main(String[] args) {

    int arr[]={0,1,0,0,3,0,4,0,};
    mz move=new mz(arr);
       
    }
    

}
