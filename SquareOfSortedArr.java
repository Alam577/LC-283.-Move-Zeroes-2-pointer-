class SquareOfSortedArr {
    public int[] sortedSquares(int[] nums) {
        //Brute - force 
        // int square=1;
        // for(int i =0;i<nums.length;i++)
        // {
        //      nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        //TWo-Pointer

       int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;

        int n = nums.length;
        int[] result = new int[n];

        while (left <= right) {
            int sq_left = nums[left] * nums[left];
            int sq_right = nums[right] * nums[right];

            if (sq_left > sq_right) {
                result[i] = sq_left;
                left++;
            } else {
                result[i] = sq_right;
                right--;
            }

            i--;   
        }

        return result;
    }
}
    