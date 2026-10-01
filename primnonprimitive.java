public class primnonprimitive {
    public static void main(String[] args) {
        int passingnum=5;
        callingVariable(passingnum);
        System.out.println("after method call");
        System.err.println(passingnum);
         int[] arr1={1,2,3,4,5};
         callingArray(arr1);
         System.out.println("after mehtid call");
         for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
         }    
}
static void callingArray(int[] nums){
    nums[2]=9;
    for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }    
}
static void callingVariable (int num){
    num++;
    System.out.println(num);
    
}
}