public class EvenWord {
    public static void main(String[] args) {
        String inputtext = "Sky is blue and vast";
        String[] wordarray = inputtext.split(" ");

        for (String currentWord : wordarray) {
            if (currentWord.length() % 2 == 0) {
                System.out.println(currentWord);
            }
        }
    }

}
