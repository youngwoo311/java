package part2;

public class ComparisonOperator {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

        i += 10;
        System.out.println(i);
        System.out.println(i -= 5);
    }
}
