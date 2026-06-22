public class Question5 {

    public static int sqrt(int n) {

        int low = 1;
        int high = n;
        int ans = 0;


        while(low <= high) {

            int mid = low + (high-low)/2;


            if(mid <= n/mid) {

                ans = mid;
                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }


        return ans;
    }


    public static void main(String[] args) {

        int n = 25;

        System.out.println("Square Root: " + sqrt(n));
    }
}