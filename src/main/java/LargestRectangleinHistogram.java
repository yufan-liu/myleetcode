import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 15:33
 */
public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0, i = 0, len = height.length;

        while(i <= len) {
            int val = (i == len) ? 0 : height[i];
            if (stack.empty() || height[stack.peek()] <= val) {
                stack.push(i);
                i++;
            } else {
                int area = height[stack.pop()] * (stack.empty() ? i : i - stack.peek() - 1);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
