class LengthofLast {
    public static void main(String[] args) {

        String s = "Hello World World2";
        String[] words = s.split(" ");
        String lastword = words[words.length - 1];
        System.out.println(lastword.length());

    }
}