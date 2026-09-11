class Solution {
    public int maxArea(int[] height) {
        int maxW=0;
        int lp=0;
        int rp=height.length-1;

        while(lp < rp){
            int hei=Math.min(height[lp],height[rp]);
            int wei=rp-lp;
            int curWater=hei*wei;

            maxW=Math.max(maxW,curWater);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxW;
    }
}