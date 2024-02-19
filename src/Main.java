import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ScannerInput strings = new ScannerInput();
            RimNumbers rimNum = new RimNumbers();
            String[] array = strings.inInput().split(" ");
            String[] rimNumber = rimNum.rim;
            int count = 0;
            for(int i = 0; i< array.length; i++){
                for(int j = 0; j< rimNumber.length; j++){
                    if (array[i].equals(rimNumber[j])){
                        count++;
                    }
                }
            }
            if (count == 2){
                String[] rimNumbers = rimNum.roman;
                String str1 = array[0];
                String str2 = array[2];
                for (int i = 0; i<rimNumbers.length;i++ ){
                    if (str1.equals(rimNumbers[i])){
                        strings.number1 = i;
                    }
                    if (str2.equals(rimNumbers[i])){
                        strings.number2 = i;
                    }
                }
                for (String element : array) {
                    int result = 0;
                    switch (element) {
                        case "+":
                            result = strings.number1 + strings.number2;
                            System.out.println(rimNumbers[result]);
                            break;
                        case "-":
                            result = strings.number1 - strings.number2;
                            if(result <= 0) {
                                System.out.println("throws Exception");
                                break;
                            }
                            else{
                                System.out.println(rimNumbers[result]);
                                break;
                            }
                        case "*":
                            result = strings.number1 * strings.number2;
                            System.out.println(rimNumbers[result]);
                            break;
                        case "/":
                            result = strings.number1 / strings.number2;
                            if(result <= 0){
                                System.out.println("throws Exception");
                                break;
                            }
                            else{
                                System.out.println(rimNumbers[result]);
                                break;
                            }

                    }
                }
            }
            else {
                if(array.length == 3) {
                    strings.number1 = Integer.parseInt(array[0]);
                    strings.number2 = Integer.parseInt(array[2]);
                    if(strings.number1 <= 10 && strings.number2 <= 10) {
                        for (String element : array) {
                            switch (element) {
                                case "+":
                                    System.out.println(strings.number1 + strings.number2);
                                    break;
                                case "-":
                                    System.out.println(strings.number1 - strings.number2);
                                    break;
                                case "*":
                                    System.out.println(strings.number1 * strings.number2);
                                    break;
                                case "/":
                                    if (strings.number2 != 0 || strings.number1 != 0) {
                                        System.out.println(strings.number1 / strings.number2);
                                        break;
                                    }
                            }
                        }
                    }
                    else{
                        System.out.println("throws Exception");
                    }
                }
                else{
                    System.out.println("throws Exception");
                }
            }
        }
        catch (Exception e) {
            System.out.println("throws Exception");
        }
    }
}
class RimNumbers{
    String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

}
class ScannerInput{
    int number1;
    int number2;

    String inInput(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}