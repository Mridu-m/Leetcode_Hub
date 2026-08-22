class Solution {
    public boolean checkDivisibility(int n) {
        int digit_sum = 0, digit_product = 1;
        int temp = n;
        while(temp > 0) {
            digit_sum += (temp % 10);
            digit_product *= (temp % 10);
            temp /= 10;
        }
        return n % (digit_sum + digit_product) == 0;
    }
}