public class Question5 {

    public static int removeDuplicates(int arr[]) {

        int j = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[j]) {

                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }


    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,4,4};

        int n = removeDuplicates(arr);


        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}