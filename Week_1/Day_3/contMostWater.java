package Week_1.Day_3;


class contMostWater{
    public contMostWater() {
    }

    public int maxArea(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        int answer = 0;

        while (i < j) {

            int h = Math.min(arr[i], arr[j]);
            int w = j - i;

            int area = h * w;

            if (area > answer) {
                answer = area;
            }

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        return answer;
    }
}