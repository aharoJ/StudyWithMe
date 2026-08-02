public class Sum {
    public static void main(String[] args) {
        int answer= sum(5);
        System.out.println(answer); 
    }

    static int sum(int n){
        if (n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
}
