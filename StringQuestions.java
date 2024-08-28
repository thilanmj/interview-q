import java.util.Arrays;

public class StringQuestions {
    public static void main(String args[]) {
        String s1 = "listen";
        String s2 = "silent";
        if (isSameCharacter(s1, s2)) {
            System.out.println(s1 + " made up using same characters " + s2);
        } else {
            System.out.println(s1 + " not made up using same characters " + s2);
        }

        final StringBuilder s3 = new StringBuilder("final");
        s3.append("listen");
        s3.append("silent");
        System.out.println(s3.toString());

        String s4 = new String("String4"); // create 2 objects in heap area and SCP (String Constant Pool) area
        //intern method used to get reference from SCP
        System.out.println(s4.intern());
        String s5 = "String4";

    }

    public static boolean isSameCharacter(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new RuntimeException("String values are null");
        }

        char[] s1Characters = s1.toCharArray();
        char[] s2Characters = s2.toCharArray();

        Arrays.sort(s1Characters);
        Arrays.sort(s2Characters);

        return s1Characters.equals(s2Characters);
    }
}
