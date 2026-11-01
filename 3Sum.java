class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int a= nums[i];  
            int req= -a;  
            if(i!=0  && nums[i]==nums[i-1])
            continue;  

            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[j]+nums[k];

                if(sum==req){
                    // nums[i],nums[j],nums[k];
                    List<Integer> L1 = Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    );
                    ans.add(L1);
                    j++;
                    k--;
                    while(j<n && nums[j]==nums[j-1])
                    j++;
                    while(k>=0 && nums[k]==nums[k+1])
                    k--;

                }
                else if(sum>req){
                    k--;
                }
                else if(sum<req){
                    j++;
                }
            }
        }
        return ans;
    }
}
