package Easy;

public class sqRoot {

    /**
     *
     * sq root - cast the sq to long because integer will overflow.
     * time complexity is o(log n)
     *
     */
    class Solution {
        public int mySqrt(int x) {
            if (x < 2) return x;

            int left = 2;
            int right = x/2;

            while (left <= right) {
                int mid = (right + left)/2;
                long midsq = (long) mid*mid;

                if (midsq == x) {
                    return mid;
                } else if (midsq < x) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
            return (left + right)/2;
        }
    }
}
