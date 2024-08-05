public class Test {
    public static void main(String[] args) {
        int number =4;
        int sum=1;
        int i=1;
        while(number >= i){
           sum += sum * i;
           i++;
        }
        System.out.println(sum);
    }
}
