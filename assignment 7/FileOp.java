import java.io.*;

public class Fileop{
    public static void main(String[] args) {
        BufferedReader reader = null;

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                boolean inWord = false;

                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if ("aeiou".indexOf(ch) != -1) {
                        vowelCount++;
                    }

                    if (ch == 'a') {
                        aCount++;
                    }

                    if (Character.isLetterOrDigit(ch)) {
                        if (!inWord) {
                            wordCount++;
                            inWord = true;
                        }
                    } else {
                        inWord = false;
                    }
                }
            }

            System.out.println("\nFile operations");
            System.out.println("Total vowels: " + vowelCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Occurrences of 'a': " + aCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
