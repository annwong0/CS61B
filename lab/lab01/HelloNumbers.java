public class HelloNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;
        while (cnt < 10) {
            sum += cnt;
            System.out.print(sum + " ");
            cnt++;
        }
    }
}
