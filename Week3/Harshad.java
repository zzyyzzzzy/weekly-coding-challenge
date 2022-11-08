package Week3;

public class Harshad {
    public static boolean isHarshad(int num){
        return helper(num, 0, num);
    }
    private static boolean helper(int num, int digitSum, int originalNum){
        if(num <= 0){
            return originalNum % digitSum == 0;
        }
        return helper(num / 10, digitSum + num % 10, originalNum);
    }

    public static void main(String[] args) {
        int[] testingNums = new int[]{75, 171, 481, 89, 516, 200};
        for(Integer i : testingNums){
            String res = isHarshad(i)? " is" : " is NOT";
            System.out.println("Number " + i + res + " Harshad number");
        }
    }
}
