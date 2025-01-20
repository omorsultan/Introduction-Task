package practice_problem_02;

public class sumOfTheSeries {
    public static void main(String[] args) {
        int init1 = 2;
        int end1 = 20;
        int sum1 = 0;
        for (int i = init1; i <= end1; i += 2) {
            System.out.print(i + " ");
            sum1 += i;
        }
        System.out.println("     The sum of the series is: " + sum1);

        int init2 = 1;
        int end2 = 19;
        int sum2 = 0;
//        System.out.println();
        for (int i = init2; i <= end2; i += 2) {
            System.out.print(i + " ");
            sum2 += i;
        }
        System.out.println("     The sum of the series is: " + sum2);
        
    }
}