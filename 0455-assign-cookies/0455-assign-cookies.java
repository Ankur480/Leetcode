class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int grid = 0;
        int size = 0;
        while(grid < g.length && size < s.length){
            if(s[size] >= g[grid])
            {
                ++count;
                ++grid;
                ++size;
            } else ++size;
        }
        return count;

    }
}