class Solution {
    public int[] sortArray(int[] nums) {
  mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r,mid);
}
private void merge(int[] arr, int l, int r, int mid){
    int i = l;
    int j = mid+1;
    ArrayList<Integer> newone = new ArrayList<>();
    int idx =0;
    while(i<=mid && j<=r){
        if(arr[i]<arr[j]){
            newone.add(arr[i]);
            i++;
        }else{
            newone.add(arr[j]);
            j++;
        }
    }
    while(i<=mid){
        newone.add(arr[i]);
        i++;
    }
    while(j<=r){
        newone.add(arr[j]);
        j++;
    }
    for(int k =l;k<=r;k++){
        arr[k]=newone.get(k-l);
    }

}
}