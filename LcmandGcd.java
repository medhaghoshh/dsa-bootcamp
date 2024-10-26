class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }
    
    static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Long a = 14L, b = 8L;
        Long[] result = lcmAndGcd(a, b);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
}