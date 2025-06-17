public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No parameters");
            return;
        }
        String longest = args[0];
        for (String s : args) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("Longest parameter: " + longest);
    }
}
