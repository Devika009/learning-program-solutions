import java.util.Scanner;

public class FinancialForecasting {

    public static double calculateAverage(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }

    public static double[] forecastNextMonths(double[] earnings, int monthsToForecast) {
        double[] forecast = new double[monthsToForecast];
        int windowSize = 3;

        for (int i = 0; i < monthsToForecast; i++) {
            int startIndex = Math.max(0, earnings.length - windowSize + i);
            int count = 0;
            double sum = 0;

            for (int j = startIndex; j < earnings.length + i; j++) {
                sum += (j < earnings.length) ? earnings[j] : forecast[j - earnings.length];
                count++;
            }

            forecast[i] = sum / count;
        }

        return forecast;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of past months: ");
        int n = scanner.nextInt();

        double[] earnings = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter earnings for month " + (i + 1) + ": ");
            earnings[i] = scanner.nextDouble();
        }

        double avg = calculateAverage(earnings);
        System.out.println("Average Monthly Earnings: " + avg);

        double[] forecast = forecastNextMonths(earnings, 3);

        System.out.println("Forecasted Earnings for Next 3 Months:");
        for (int i = 0; i < forecast.length; i++) {
            System.out.printf("Month %d: %.2f\n", (n + i + 1), forecast[i]);
        }
    }
}
