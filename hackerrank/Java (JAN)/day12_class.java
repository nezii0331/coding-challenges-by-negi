public class day12_class{
    public int [] merge(int [] nums1, int m, int [] nums2, int n){

        int [] result = new int[m+n];
          
        int p1 = m - 1;
        int p2 = n - 1;
        int PFill = m + n -1;

        while(p1 >=0 && p2 >=0){
            if(nums1[p1] > nums2[p2]){
                result[PFill --] = nums1[p1--];
            } else{
                result[PFill --] = nums2[p2--];
            }
        }

        while (p2 >= 0 ){
             result[PFill --] = nums2[p2--];
        }

        while(p1 >= 0){
            result[PFill --] = nums1[p1--];
        }

        System.out.println(Arrays.toString(result));

        for(int i = 0; i< m + n; i++){
            nums1[i] = result[i];
        }
        return nums1;
    }
}
