package Chapter_1;


import java.util.Arrays;
import java.util.List;

public class ApplyingIndentation_23 {

    public String beforeJDK12() {
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";
        return days;
//
//        Sunday
//        Monday
//        Tuesday
//        Wednesday
//        Thursday
//        Friday
//        Saturday
//        Sunday
    }

    public void afterJDK12() {
        List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i).indent(i));

//            Monday
//
//              Tuesday
//
//                Wednesday
//
//                  Thursday
//
//                    Friday
//
//                     Saturday

            System.out.println("+++++++++++indentLength++++++++");
            days.stream()
                    .forEach(d -> System.out.println(d.indent(d.length())));

            System.out.println("  +++indenting html++++++  ");
            String html = "<html>";
            String body = "<body>";
            String h2 = "<h2>";
            String text = "<Hello World!!!>";
            String closeH2 = "</h2>";
            String closeBody = "/<body>";
            String closeHtml = "/html";
            System.out.println(html.indent(0) + body.indent(4) + h2.indent(8) +
                    text.indent(12) + closeH2.indent(8) + closeBody.indent(4) +
                    closeHtml.indent(0));

        }
    }


    public static void main(String[] args) {
        ApplyingIndentation_23 ap = new ApplyingIndentation_23();
        ap.beforeJDK12();
        System.out.println(ap.beforeJDK12());
        ap.afterJDK12();

    }


}
//
//
//// output:
///Users/enverjume/Library/Java/JavaVirtualMachines/openjdk-18.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=56601:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/enverjume/IdeaProjects/JavaCodingProblems2023/out/production/JacCodingProblems Chapter_1.ApplyingIndentation_23
//        Sunday
//        Monday
//        Tuesday
//        Wednesday
//        Thursday
//        Friday
//        Saturday
//        Sunday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Monday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Tuesday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Wednesday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Thursday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Friday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//        Saturday
//
//        +++++++++++indentLength++++++++
//        Sunday
//
//        Monday
//
//        Tuesday
//
//        Wednesday
//
//        Thursday
//
//        Friday
//
//        Saturday
//
//        +++indenting html++++++
//<html>
//<body>
//<h2>
//<Hello World!!!>
//</h2>
//        /<body>
///html
//
//
//        Process finished with exit code 0

