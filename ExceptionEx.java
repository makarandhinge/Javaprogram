public class ExceptionEx {
    public static void main(String[] args) {
        try{
        int[] mynumber = {1,2,3};
        System.out.println(mynumber[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
