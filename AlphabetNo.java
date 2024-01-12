public class AlphabetNo {
    public static void main(String[] args) {
        String columnTitle = "C";
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        System.out.println(result);
    }

}
