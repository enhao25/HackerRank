// Complete the timeConversion function below.
static String timeConversion(String s) {
    
    // Using substring to get first 2 value (currentHour) and last 2 value (AmOrPm) 
    int lengthBeforeAmOrPm = s.length() - 2;
    int currentHour = Integer. parseInt(s.substring(0, 2));
    String AmOrPm = s.substring(lengthBeforeAmOrPm);
    
    // Time Complexity: O(1)
    if (AmOrPm.equals("AM") && currentHour == 12) {
        // If it is 12AM - 12.59AM
        return "00" + s.substring(2, lengthBeforeAmOrPm);
    } else if(AmOrPm.equals("AM") || currentHour == 12) {
        // If it is AM or 12PM - 12.59PM
        return s.substring(0, lengthBeforeAmOrPm);
    } else {
        // If it is PM excluding 12PM - 12.59PM
        int newHour = currentHour + 12;
        return Integer.toString(newHour) + s.substring(2, lengthBeforeAmOrPm);
    }
}