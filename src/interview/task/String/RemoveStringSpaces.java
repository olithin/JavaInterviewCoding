package interview.task.String;

/*
* Simple, remove the spaces from the string, then return the resultant st
* */
public class RemoveStringSpaces {
//    return x.replace(" ", "");
public static void main(String[] args) {
    String str = " Hell o";
    System.out.println(noSpace(str));
}


    static String noSpace(String x) {
        String res = "";
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) != ' ')
                res += x.charAt(i);

        }
        return res;
    }
}
