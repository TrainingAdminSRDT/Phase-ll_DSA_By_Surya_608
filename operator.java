public class Main {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 2, m;

        m = ((i++ != 0 && j++ != 0 && k++ != 0) || (l++ != 0)) ? 1 : 0;

        System.out.println(i + " " + j + " " + k + " " + l + " " + m);
    }
}