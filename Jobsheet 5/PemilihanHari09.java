import java.util.Scanner;

public class PemilihanHari09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        String dayName, dayType;

        //input
        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default :
                dayType = "invalid day name";
        }

        //cetak (print)
        System.out.println(dayName + " is a " + dayType);
    }
}