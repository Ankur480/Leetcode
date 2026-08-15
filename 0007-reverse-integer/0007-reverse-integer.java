class Solution {
    public int reverse(int x) {
        int num = x;
        int rev = 0;
        while (num != 0) {
            int temp = num % 10;
            num /= 10;
            int max = Integer.MAX_VALUE; // This value store the maximum value of int data type
            int min = Integer.MIN_VALUE; // This value store the minimum value of int data type

            if (rev > max / 10 ||
                    (rev == max / 10 && temp > max % 10)) {
                return 0;
            }

            if (rev < min / 10 ||
                    (rev == min / 10 && temp < min % 10)) {
                return 0;
            }
            rev = (rev * 10) + temp;
        }
        return rev;
    }
}