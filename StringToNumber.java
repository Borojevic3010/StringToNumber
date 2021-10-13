import java.util.ArrayList;

public class StringToNumber {
    //V poljubnem jeziku napiši funkcijo,
    // ki sprejme kot input string v obliki "one-two-seven-four-nine-zero"
    // in vrne string v obliki "1+2+7+4+9+0=23". Pretestiraj tudi z drugimi primeri,
    // ampak načeloma more program znat parsat vse številke od 0-9.
    // Karkoli v tem navodilu ni bilo posebej specificirano lahko narediš kakorkoli se ti zdi najbolj smiselno
    public static void main(String[] args) {
        String input = "one-two-seven-four-nine-zero-five";

        ArrayList<String> numbersString = splitNumbers(input);

        int sum = 0;
        String rezultStr = "";
        for(int i = 0; i < numbersString.size(); i++){
            int numberInt = StringToInt(numbersString.get(i));
            if(numberInt == -1)
                return;
            if(i == numbersString.size()-1){
                rezultStr += numberInt + "=";
            }else {
                rezultStr += numberInt + "+";
            }
            sum += numberInt;
        }
        rezultStr += sum;
        System.out.println(rezultStr);
    }

    static private ArrayList<String> splitNumbers(String str){
        ArrayList<String> numbersArray = new ArrayList<>();
        while (str != null){
            if(str.contains("-")) {
                int index = str.indexOf("-");
                numbersArray.add(str.substring(0, index));
                str = str.substring(index + 1);
            }else {
                numbersArray.add(str);
                break;
            }
        }
        return numbersArray;
    }

    static private int StringToInt(String numberStr){
        int numberInt = -1;
        switch (numberStr) {
            case "one":
                numberInt = 1;
                break;
            case "two":
                numberInt = 2;
                break;
            case "three":
                numberInt = 3;
                break;
            case "four":
                numberInt = 4;
                break;
            case "five":
                numberInt = 5;
                break;
            case "six":
                numberInt = 6;
                break;
            case "seven":
                numberInt = 7;
                break;
            case "eight":
                numberInt = 8;
                break;
            case "nine":
                numberInt = 9;
                break;
            case "zero":
                numberInt = 0;
                break;
            default:
                System.out.println("Input was not a valid number!");
        }
        return numberInt;
    }
}
