package Week2.Atbash;

public class Atbash {
    public static String atbash(String str){
        String mapperLower = "abcdefghijklmnopqrstuvwxyz";
        String mapperUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char curChar = str.charAt(i);
            String mapper = mapperLower;
            if(Character.isUpperCase(curChar)){
                mapper = mapperUpper;
            }
            int index = mapper.indexOf(curChar);
            if(index != -1){
                curChar = mapper.charAt(25 - index % 26);
            }
            sb.append(curChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(atbash("apple"));
        System.out.println(atbash("apple 12 @"));
        System.out.println(atbash("Hello world!"));
        System.out.println(atbash("Christmas is the 25th of December"));
    }
}
