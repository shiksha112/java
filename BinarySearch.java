package Arrays_Java;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int key = 5;
        int st = 0;
        int end = arr.length -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid] == key){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<key){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        
    }
}
