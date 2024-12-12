package Day3;

public class TitleCase {
    public static String toTitleCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder titleCaseStr = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCaseStr.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCaseStr.toString().trim();
    }

    public static void main(String[] args) {
        String str = "java is a programming language";
        System.out.println("Title case: " + toTitleCase(str));
    }
}
