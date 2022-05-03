import java.io.*;

public class ProjectApplication {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        String line;
        String str;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, false))) {

            while ((line = bufferedReader.readLine()) != null) {

                str = line.substring(0, line.indexOf("="));

                double result = MathExpression.evaluate(str);

                bufferedWriter.append(line.replace("?", result + "\n"));
            }
        }
    }

}
