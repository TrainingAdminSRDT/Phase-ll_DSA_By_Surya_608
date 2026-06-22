public class Question1 {

    public static String reverse(String str) {

        char arr[] = str.toCharArray();

        int i = 0;
        int j = arr.length - 1;


        while(i < j) {

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }


    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverse(str));
    }
}