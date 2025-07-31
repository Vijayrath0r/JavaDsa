class Solution {
    public int commonFactors(int a, int b) {
        Set<Integer> set = new HashSet<>();
        int smallNumber = a < b ? a : b;
        for (int i = 1; i <= Math.sqrt(smallNumber); i++) {
            if (a % i == 0 && b % i == 0) {
                set.add(i);
            }
            if (a % (smallNumber / i) == 0 && b % (smallNumber / i) == 0) {
                set.add(smallNumber / i);
            }
        }
        return set.size();
    }
}