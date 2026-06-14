public class MergeSort {
    public static void main(String [] args){
        int  arr[] = {1,4,3,6,7,3,8};
        divide(arr, 0, arr.length-1);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    
    public static void divide(int[] arr, int lo, int hi){
        if(lo<=hi){
            return;
        }
        int mid = (lo+hi)/2;
        divide(arr, lo, mid);
        divide(arr, lo, mid+1);
        merge(arr, lo, mid, hi);
    }
    public static void merge(int[] arr, int lo, int mid, int hi){
        int i = lo;
         int j = mid+1;
         int ans[] = new int[hi+lo-1];
         int k=0;

         while(i<=mid && j<=hi){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=hi){
            ans[k] = arr[j];
            k++;
            j++;
        }

        int m=0;
        for(int p=lo; p<=hi; p++){
            arr[p] = ans[m];
            m++;
        }
    }

    
}
