public static String reverseString(String str) {
    // Initalize char Array and string length
    char[] charArray = str.toCharArray();
    int stringLength = charArray.length;
    
    // Run a loop to switch char from 1st to last inwards
    for (int i=0; i < stringLength / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[stringLength - i-1];
        charArray[stringLength - i-1] = temp;
    }
    return new String(charArray);
} 