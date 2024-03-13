
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        // Loop until the fast pointer reaches 1 (happy number) or the slow pointer
        // meets the fast pointer (cycle detected)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));

            if (fast == 1) { // If the fast pointer reaches 1, we've found a happy number, return true
                return true;
            }
            if (slow == fast) { // If the slow pointer meets the fast pointer, a cycle is detected, return false
                return false;
            }
        }
        return fast == 1; //// The loop has ended, check if we found a happy number (fast is 1), return
                          //// true if so
    }

    private int getNext(int n) {

        int totalSum = 0;
        while (n > 0) { // Loop until n is reduced to 0
            int d = n % 10; // Get the last digit of n
            n /= 10; // Remove the last digit from n
            totalSum += d * d; // Add the square of the digit to the total sum
        }
        return totalSum;
    }
}
