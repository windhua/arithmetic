package edu.princeton.cs.algs4.chapter11;

class AA {
    public static String findRepeatNumber(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = 'T';
                array[size++] = 'N';
                array[size++] = 'T';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }

    public static void main(String[] args) {
        String a = "hi wo shi";
        for (int i = 0; i < findRepeatNumber(a).length(); i++) {
            System.out.print(findRepeatNumber(a).charAt(i));
        }
    }
}
