public class CheckParam {
    public static boolean checkParameters(String meter, String centimeter, String milimeter) {
        String[] param = {meter, centimeter, milimeter};
        int i = 0;
        for (String s : param) {
            if (s != "") {
                i += 1;
            }
        }
        if (i == 0 || i > 1) {
            return false;
        } else {
            return true;
        }
    }
}
