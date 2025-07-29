import java.util.*;

class Solution {
    public int trap(int[] height) {
        //leftmaxboundary
        //rightmaxboundary-array

        //loop to find waterlevel=min(leftmax,rightmax)
        //trapped water -> waterlevel-height[i]

        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        int waterlevel=0;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel-height[i];
        }
    return trappedwater;
    }
}