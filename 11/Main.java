class Main {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int currentHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            int area = currentHeight * distance;

            if (area > max) {
                max = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}