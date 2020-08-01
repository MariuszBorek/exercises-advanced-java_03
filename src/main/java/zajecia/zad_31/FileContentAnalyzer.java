package zajecia.zad_31;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileContentAnalyzer {
    private static String path =
            Paths.get("").toAbsolutePath().toString() +  "/src/main/java/zajecia/zad_31/sentences.txt";
    private static String pathResults =
            Paths.get("").toAbsolutePath().toString() +  "/src/main/java/zajecia/zad_31/sentencesresults.txt";
    private String fileContent = "";
    public void getFileContent() {
        try {
            Scanner scanner = new Scanner(new File(path));
            while(scanner.hasNextLine()) {
                fileContent += scanner.nextLine();
            }
            fileContent = fileContent.replaceAll(",", "").replaceAll("\\.", "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String analyzeFileContent() {
        String[] words = fileContent.split(" ");
        Map<String, Integer> wordsCounter = new HashMap<>();
        for (String word : words) {
            if(!wordsCounter.containsKey(word)) {
                wordsCounter.put(word, 1);
            } else {
                wordsCounter.put(word, wordsCounter.get(word) + 1);
            }
        }
            return wordsCounter.keySet().stream()
                    .map(word -> String.format("| %15s | %3d |", word, wordsCounter.get(word)))
                    .collect(Collectors.joining("\n"));
    }

    public void writeResultsToFile() {
        try {
            FileWriter fw = new FileWriter(new File(pathResults));
            fw.write(analyzeFileContent());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FileContentAnalyzer fileContentAnalyzer = new FileContentAnalyzer();
        fileContentAnalyzer.getFileContent();
        fileContentAnalyzer.writeResultsToFile();
    }

}
