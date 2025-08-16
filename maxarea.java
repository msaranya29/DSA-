import java.util.*;

public class maxarea {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // next smaller right
        int nsl[] = new int[arr.length]; // next smaller left

        // Next Smaller to Right
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        // Next Smaller to Left
        stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        // Calculate area
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Maximum area in histogram: " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}
