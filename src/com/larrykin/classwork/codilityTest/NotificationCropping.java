package com.larrykin.classwork.codilityTest;


/**
 * Prepare a notification of the given message which will be displayed on a mobile device. The message is made of words separated by single spaces. The length of the notification is limited to K characters. If the message is too long to be displayed fully, some words from the end of the message should be cropped, keeping in mind that:
 * • the notification should be as long as possible;
 * • only whole words can be cropped;
 * • if any words are cropped, the notification should end with "..."; the dots should be separated from the last word by a single space;
 * • the notification may not exceed the K-character limit, including the dots.
 * If all the words need to be cropped, the notification is"..." (three dots without a space).
 * For example, for message = "And now here is my secret" and K = 15, the notification is "And now ...".
 * Note that:
 * • the notification "And ..." would be incorrect, because there is a longer correct notification;
 * • the notification "And now her ..." would be incorrect, because the original message is cropped through the middle of a word;
 * • the notification "And now ... "would be incorrect, because it ends with a space;
 * • the notification "And now here..." would be incorrect, because there is no space before the three dots;
 * • the notification "And now here ..." would be incorrect, because it exceeds the 15-character limit.]
 * <p>
 * Write a function:
 * function solution(message, K);
 * that, given a string message and an integer K, returns the notification to display, which has no more than K characters, as described above.
 * Examples:
 * 1. For message = "And now here is my secret" and K = 15, the function should return "And now ...", as explained above.
 * 2. For message = "There is an animal with four legs" and K = 15, the function should return "There is an ...".
 * 3. For message = "super dog" and K = 4, the function should return "...".
 * 4. For message = "how are you" and K = 20, the function should return "how are you".
 * Assume that:
 * • K is an integer within the range [3..500]:
 * • the length of string message is within the range [1..500];
 * • string message is made of English letters ('a'-'z', 'A-Z') and spaces (* *);
 * • message does not contain spaces at the beginning or at the end;
 * • words are separated by a single space (there are never two or more consecutive spaces).
 */
public class NotificationCropping {

    public static void main(String[] args) {

        String message1 = "And now here is my secret";
        int K1 = 15;
        System.out.println(solution(message1, K1)); // Output: "And now ..."

        String message2 = "There is an animal with four legs";
        int K2 = 15;
        System.out.println(solution(message2, K2)); // Output: "There is an ..."

        String message3 = "super dog";
        int K3 = 4;
        System.out.println(solution(message3, K3)); // Output: "..."

        String message4 = "how are you";
        int K4 = 20;
        System.out.println(solution(message4, K4)); // Output: "how are you"
    }

    private static String solution(String message, int K) {
        if (K < 3 ) {
            return "...";
        }

        //split the message to strings by space
        String[] words = message.split(" ");
        StringBuilder notification = new StringBuilder();
        String ellipsis = "...";

        for (String word : words){
            if(notification.length() + word.length() + 5 > K){
                if(notification.isEmpty()){
                    return ellipsis;
                }
                notification.append(" ").append(ellipsis);
                break;
            }
            if(!notification.isEmpty()){
                notification.append(" ");
            }
            notification.append(word);
        }
        if(notification.length() <= K){
            return notification.toString();
        }

        return notification.substring(0, K-ellipsis.length()) + ellipsis;
    }

}
