public class PlusOne {
    public static void main(String[] args) {

        String[] digit = new String[3];
        digit[0] = "1";
        digit[1] = "2";
        digit[2] = "3";

        String join = String.join("", digit);
        int intjoin = Integer.parseInt(join);
        join++;
        System.out.println(join);
    }

}
