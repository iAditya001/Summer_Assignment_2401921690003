package Week_1.Day_3;


class sortedSquares{
    public sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int start = 0;
        int end = n - 1;
        int position = n - 1;

        while (start <= end) {
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];

            if (startSquare > endSquare) {
                result[position] = startSquare;
                start++;
            } else {
                result[position] = endSquare;
                end--;
            }

            position--;
        }

        
    }
}