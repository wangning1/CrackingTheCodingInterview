package com.winner;

public class _01_05_OneEditAway {

    public static boolean oneEditAway(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        int firstLen = first.length();
        int secondLen = second.length();

        if (Math.abs(firstLen - secondLen) > 1) {
            return false;
        }

        if (firstLen < secondLen) {
            String tmp = first;
            first = second;
            second = tmp;
        }

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        int diffCount = 0;
        if (firstLen == secondLen) {
            for (int i = 0; i < firstLen; i++) {
                if (firstChars[i] != secondChars[i]) {
                    diffCount++;
                }
                if (diffCount > 1) {
                    return false;
                }
            }
        } else {
            int firstNum = 0;
            int secondNum = 0;
            while (firstNum < firstLen && secondNum < secondLen) {
                if (firstChars[firstNum] == secondChars[secondNum]) {
                    firstNum++;
                    secondNum++;
                } else {
                    firstNum++;
                    diffCount++;
                }
                if (diffCount > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(_01_05_OneEditAway.oneEditAway("abc","abcd"));
    }

}
