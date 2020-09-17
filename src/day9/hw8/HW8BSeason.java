package day9.hw8;

public class HW8BSeason {
    public static void main(String[] args) {
        String theMonth = "november";
        System.out.println(getMeTheSeason(theMonth));
    }

    private static String getMeTheSeason(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
        String answer = " ";
        switch (month) {
            case "January":
                answer = "Winter";
                break;
            case "February":
                answer = "Winter";
                break;
            case "March":
            case "April":
            case "May":
                answer = "Spring";
                break;
            case "June":
                answer = "Summer";
                break;
            case "July":
                answer = "Summer";
                break;
            case "August":
                answer = "Summer";
                break;
            case "September":
                answer = "Autumn";
                break;
            case "Oktober":
                answer = "Autumn";
                break;
            case "November":
                answer = "Autumn";
                break;
            case "December":
                answer = "Winter";
                break;
            default:
                answer = "The month is not known";

        }
        return answer;
    }
}
