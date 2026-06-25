package Lessons.OtherTopics;

public class StringsFunctions {
    void main(){
        // Original String
        String originalName = "Nelson Martins Fernandes Neto";
        System.out.println(originalName);

        // UpperCase
        String nameUpper = originalName.toUpperCase();
        System.out.println(nameUpper);

        // LowerCase
        String nameLower = originalName.toLowerCase();
        System.out.println(nameLower);

        // Removing spaces from the beginning and end of the string
        String nameWithoutSpaces = originalName.trim();
        System.out.println(nameWithoutSpaces);

        // Trimming a string from the specified position
        String trimmingNameBegin = originalName.substring(6);
        System.out.println(trimmingNameBegin);

        // Trimming a string from the specified start and end positions
        String trimmingNameBeginAndEnd = originalName.substring(0,6);
        System.out.println(trimmingNameBeginAndEnd);

        // Replacing character
        String replacingChar = originalName.replace('n', 'm');
        System.out.println(replacingChar);

        // Replacing string
        String replacingString =  originalName.replace("Martins", "Jacinto");
        System.out.println(replacingString);

        // First occurrence of a specific letter (indexOf returns a number (int), not a string)
        int firstLetter = originalName.indexOf("n");
        System.out.println(firstLetter);

        // Last occurrence of a specific letter
        int lastLetter = originalName.lastIndexOf("n");
        System.out.println(lastLetter);

        // Operation/Function split
        String[] nameVector = originalName.split(" ");

        String firstWord = nameVector[0];
        System.out.println(firstWord);

        System.out.println(nameVector.length);

        for (int i = 0; i < nameVector.length; i++) {
            System.out.println(i + "º " + nameVector[i]);
        }
    }
}
