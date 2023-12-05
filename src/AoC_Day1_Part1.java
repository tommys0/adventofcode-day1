import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AoC_Day1_Part1 {
    public static void main(String[] args) {
        String inputFilePath = "text.txt";

        long sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (Character.isDigit(currentChar)) {
                        char nextChar = (i < line.length() - 1) ? line.charAt(i + 1) : line.charAt(0);
                        if (Character.isDigit(nextChar)) {
                            sum += Character.getNumericValue(currentChar) * 10 + Character.getNumericValue(nextChar);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println(sum);
    }
}
