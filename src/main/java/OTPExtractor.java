/*
Extract the OTP from the SMS. "Your one-time password is 246148. Don't share this code with
anyone \r\nBvwt3f8js2S"
*/

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPExtractor {
    private static String extractOTP(String SMS) {
        String OTPpattern = "\\b\\d{6}\\b";
        Pattern pattern = Pattern.compile(OTPpattern);
        Matcher matcher = pattern.matcher(SMS);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        String SMS = "Your one-time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
        System.out.println("Extracted OTP: " + extractOTP(SMS));
    }
}