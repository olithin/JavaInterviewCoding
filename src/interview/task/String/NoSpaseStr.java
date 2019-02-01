package interview.task.String;

public class NoSpaseStr {
    public static void main(String[] args) {
        String str = "Hell o";
        System.out.println(deleteSpase(str));
    }

    private static String deleteSpase(String str) {
        StringBuilder result = new StringBuilder();
        for(int i =0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            result.append(str.charAt(i));

        }
        return result.toString();
    }
}
