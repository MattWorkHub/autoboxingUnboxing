public class Main {
    public static void main(String[] args) {
        Integer int1 = 1;
        Integer int2 = 2;
        int integer1 = 3;
        int integer2 = 4;
        Character char1 = 'a';
        char character1 = 'b';
        intSum(int1,int2);
        integerSum(integer1,integer2);
        printChar(char1);
        printCharacter(character1);
    }
    public static void intSum(int int1,int int2){
        System.out.println("Int sum is " + (int1 + int2));
    }
    public static void printChar(char char1){
        System.out.println("Char is " + char1);
    }
    public static void integerSum(Integer integer1, Integer integer2) {
        System.out.println("Integer sum is " + (integer1 + integer2));
    }
    public static void printCharacter(Character character1) {
        System.out.println("Character is " + character1);
    }
}