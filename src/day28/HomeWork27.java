package day28;


public class HomeWork27 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
        System.out.println(plusOut("xy12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
    }

    private static String plusOut(String str, String xy) {
        String result = "";
        String plus = "+";
        int count = 0;
        String input = str;
        for (int i = 0; i < str.length(); i++) {
            if (i == input.indexOf(xy) + count) {
                result += str.substring(i, i + xy.length());
                i += xy.length() - 1;
                count += input.indexOf(xy) + xy.length();
                input = input.substring(input.indexOf(xy) + xy.length());
            } else {
                result += plus;
            }
        }
        return result;
    }
/*    private static String plusOut(String str, String searchStr) {
        String outputStr = "";
        String changStr = "+";
        int i = 0;
        while (i < str.length()) {

            int indexStart = str.indexOf(searchStr, i);
            if (indexStart == 0) {
                outputStr = outputStr + searchStr;
                i++;
                continue;
            } else if (indexStart > 0) {
                int tempIndex = indexStart + searchStr.length();
                for (int j = i; j < indexStart; j++) {
                    outputStr += changStr;
                }
                outputStr = outputStr + searchStr;
                i = tempIndex;
            } else if (indexStart < 0) {
                outputStr = outputStr + changStr;
                i++;
            }
        }
        return outputStr;
    }*/
}
/*    private static String plusOut(String inputString, String secondStr) {
        String plus = "+";
        String output = "";
        int size = secondStr.length();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == secondStr.charAt(0)) {
                // то тогда мы не меняем на плюсы,
                // пока длина второго стринга не закончится
                for (int j = 0; j < size; j++) {
                    output = output + secondStr.charAt(j);
                    i = i + 1;
                }
            } else {
                output = output + plus;
            }

        }
        return output;
    }*/

