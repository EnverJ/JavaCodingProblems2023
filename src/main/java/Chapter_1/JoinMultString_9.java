package Chapter_1;

import java.sql.SQLOutput;

public class JoinMultString_9 {
    public static String joinByDelimiter(char delimiter, String ... args){
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<args.length-1;i++){
            sb.append(args[i]).append(delimiter);
        }
        sb.append(args[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinByDelimiter(' ',"you", "are" ,"my","java"));
    ;
    }
}
