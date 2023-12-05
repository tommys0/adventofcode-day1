import java.io.BufferedReader;
import java.io.FileReader;

public class AoC_Day1_Part1 {
    public static void main(String[] args) {
        String inputFilePath = "text.txt";

        long sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            sum = br.lines()
                    .map(s -> s.replaceAll("[a-z]", ""))
                    .mapToInt(s -> (s.charAt(0) - '0') * 10 + s.charAt(s.length() - 1) - '0')
                    .sum();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println(sum);
    }
}