public class Question3 {

    public static int lastOccurrence(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;


        while(low <= high) {

            int mid = low + (high-low)/2;


            if(arr[mid] == target) {

                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int arr[] = {1,2,2,2,3,4};

        System.out.println(lastOccurrence(arr,2));
    }
}