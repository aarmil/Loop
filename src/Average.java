public class Average {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        while (count<=100) {
            sum = sum + count;
            count++;
        }
        float mean = (float) sum / count;
        System.out.println("Arithmetic mean = " + mean);
    }
}
