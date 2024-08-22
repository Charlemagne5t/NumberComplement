class Solution {
    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();

        int i = 1;
        int j = 0;
        int res = 0;
        while(j < len) {
            if((num & (1 << j)) == 0) {
                res += i;
            }
            i =  1 << j + 1;
            j++;
        }

        return res;
    }
}