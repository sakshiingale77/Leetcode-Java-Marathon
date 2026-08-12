class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> firsthashset = new HashSet<>();
HashSet<Integer> finalhashset = new HashSet<>();
        
        for(int num : nums1){
firsthashset. add(num);
            }
       for (int num : nums2){
if(firsthashset.contains(num)){
finalhashset. add(num);
} 
       }
    int [] result = new int[finalhashset. size()];
    int i = 0;
for(int x:finalhashset){
     result[i]= x;
    i= i+1;
        
    }return result;

}
    }
