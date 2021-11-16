public class IF {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100; i++){
            int m = i % 21;
            if (m == 0){
                System.out.println(i);
            }
        }
    }
}
