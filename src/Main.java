import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = ("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$");
        String mac_address = "ee:F8:aa:97:55-b4";
        System.out.print(Pattern.matches(regex,mac_address));
    }
}