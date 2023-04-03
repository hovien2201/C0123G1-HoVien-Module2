package case_study.util;

public class CheckRegexAll {
    public static boolean checkIdVilla(String str) {
        String regex = "^(SVVL)\\-[0-9]{4}$";
        return (str.matches(regex));
    }

    public static boolean checkIdHouse(String str) {
        String regex = "^(SVHO)\\-[0-9]{4}$";
        return (str.matches(regex));
    }

    public static boolean checkIdRoom(String str) {
        String regex = "^(SVRO)\\-[0-9]{4}$";
        return (str.matches(regex));
    }

    public static boolean checkNameAll(String str) {
        String regex = "^[A-Z][a-z]+$";
        return (str.matches(regex));
    }

    public static boolean checkArea(String str) {
        String regex = "^([3-9][0-9])|([1-9][0-9]{2,})$";
        return (str.matches(regex));
    }

    public static boolean checkPriceAndNumberOfFloors(String str) {
        String regex = "^[0-9]+$";
        return (str.matches(regex));
    }

    public static boolean checkNumberHumanMax(String str) {
        String regex = "^(1[0-9]+)|[1-9]$";
        return (str.matches(regex));
    }

    public static boolean checkDayBirth(String str) {
        String regex = "/^(([0-2][0-9])||3[0-1])\\/((0[0-9])||1[0-2])\\/(19((2[4-9])||([3-9][0-9]))||(200[0-5]))$/gm";
        return (str.matches(regex));
    }
}
