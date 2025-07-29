package Questions.InterviewQuestions;

import java.util.Arrays;

public class SpiltI {
    public static void main(String[] args) {
        //1. Split by space:
        String text = "Hi I am learning Java";
        String[] strings=text.split(" ");
        System.out.println(Arrays.toString(strings));

        //2. Split by comma: comma is alredy present
        String csv = "apple,banana ,grape";
        String[] fruits = csv.split(",");
        System.out.println(Arrays.toString(fruits));

        String ip = "192.168.1.1";
        String[] parts = ip.split("\\."); // double escape!
        System.out.println(Arrays.toString(parts));
        // Output: [192, 168, 1, 1]
    }
}
