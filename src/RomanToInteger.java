public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "XIX";
        System.out.println(romanToInt(roman));
    }
    public static int romanToInt(String s) {
        int result = 0;
        char[] roman = s.toCharArray();
        for (int i = 0; i < roman.length; i++) {
            switch (roman[i]) {
                case 'I':
                    if ( i == roman.length - 1) {
                        result += 1;
                        break;
                    }
                    if (roman[i+1] == 'V') {
                        result += 4;
                        i++;
                        break;
                    } else if (roman[i+1] == 'X'){
                        result += 9;
                        i++;
                        break;
                    } else {
                        result += 1;
                        break;
                    }
                case 'X':
                    if ( i == roman.length - 1) {
                        result += 10;
                        break;
                    }
                    if (roman[i+1] == 'L') {
                        result += 40;
                        i++;
                        break;
                    } else if (roman[i+1] == 'C'){
                        result += 90;
                        i++;
                        break;
                    } else {
                        result += 10;
                        break;
                    }
                case 'C':
                    if ( i == roman.length - 1) {
                        result += 1000;
                        break;
                    }
                    if (roman[i+1] == 'D') {
                        result += 400;
                        i++;
                        break;
                    } else if (roman[i+1] == 'M'){
                        result += 900;
                        i++;
                        break;
                    } else {
                        result += 1000;
                        break;
                    }
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + roman[i]);
            }
        }
        return result;
    }
}
