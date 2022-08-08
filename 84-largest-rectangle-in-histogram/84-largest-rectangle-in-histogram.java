class Solution {
    public int largestRectangleArea(int[] heights) {
        int arraySize =  heights.length;
        int[] left = new int[arraySize];
        int[] right = new int[arraySize];
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i < arraySize; i++) {
            if (stack.isEmpty()) {
                left[i] = 0;
            } else {
                while (!stack.empty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                left[i] = stack.empty() ? 0 : stack.peek() + 1;
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = arraySize-1; i >= 0; i--) {
            if (stack.empty()) {
                right[i] = arraySize - 1;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                right[i] = stack.isEmpty() ? arraySize - 1 : stack.peek() - 1;
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i =0; i < arraySize; i++) {
            int area = heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}