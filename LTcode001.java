class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        
        while (x != 0) {
            int digit = x % 10;        
            reversed = reversed * 10 + digit; 
            x /= 10;                 
        }

        
        return original == reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(121));  
        System.out.println(solution.isPalindrome(-121)); 
        System.out.println(solution.isPalindrome(10));   
    }
}