package task;

import java.util.regex.Pattern;

public class IsPattern {

    static public boolean IPv4(String str) {
        String ipPattern =
                "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        return Pattern.matches(ipPattern, str);
    }

    static public boolean GUID(String str) {
        String guidPattern =
                "(^\\{[A-Fa-f0-9]{8}-([A-Fa-f0-9]{4}-){3}[A-Fa-f0-9]{12}\\}$)|(^[A-Fa-f0-9]{8}-([A-Fa-f0-9]{4}-){3}[A-Fa-f0-9]{12}$)";
        return Pattern.matches(guidPattern, str);
    }

    static public boolean URL(String str) {
        String urlPattern =
                "^(https?://)?(www\\.)?([a-zA-Z][-a-zA-Z0-9]*[a-zA-Z]\\.)+[a-zA-Z]{2,}(/[\\w-.~:?#\\[\\]@!$&'()*+,;%=]+)*/?$";
        return Pattern.matches(urlPattern, str);
    }

    static public boolean StrongPassword(String str) {
        String passwordPattern =
                "(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])\\w{8,}";
        return Pattern.matches(passwordPattern, str);
    }
}