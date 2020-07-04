package academy.learnprogramming;

import java.util.Calendar;

public class Practice1 {
    // 誕生日を過ぎた場合、「誕生日からXX日過ぎました」と表示するように変更する。
    public static void main(String[] args) {
        Calendar now, birthday;
        int dayOfYear, days;

        now = Calendar.getInstance();
        birthday = Calendar.getInstance();

        birthday.set(now.get(Calendar.YEAR), 2, 30); // Set birthday month - 1
        days = birthday.get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR);
        if (days >= 0) {
            System.out.println("誕生日まであと" + days + "日です");

        } else if (days < 0) {
//            System.out.println("誕生日から" + (-days) + "日過ぎました");
            System.out.println("誕生日から" + Math.abs(days) + "日過ぎました");
        }


    }

}
