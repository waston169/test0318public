public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        if(nums.length<0){
            return max;
        }
        int result []= new int[nums.length+1];
//        if(nums[0]>0){
//        	 result[0]=0;
//        }else{
//
//        }
        result[0]=0;
        for(int i=0;i<nums.length;i++){
            result[i+1]=Math.max(result[i]+nums[i], nums[i]);
            max=Math.max(result[i+1], max);
        }
        return max;

    }

    public static void main(String[] args) {
        int temp[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.printf(maxSubArray(temp)+"");

    }

}
