package academy.learnprogramming;

public class Practice2 {
    // コマンドラインで、身長（cm）、体重（kg）の順に入力してBMIの値を計算し、BMIの値によって次のようなメッセージを表示するプログラム
    // 27以上　かなり太りすぎ、23-27 ちょっと太り気味、21-23 ちょうど良いバランス、18-21 ちょっと痩せ気味、18以下 痩せ気味
    // BMI = 体重（kg）/ （身長（m）＊　身長（m））
    public static void main(String[] args) {
        double weight, height, bmi;
        if (!(args.length == 2)) {
            System.err.println("身長（cm）、体重（kg）の順に入力してください。");
            System.exit(1);
        }
        try{
            height = Double.parseDouble(args[0]) / 100;
            weight = Double.parseDouble(args[1]);
            bmi = weight / (height * height);
            if(bmi >= 27) {
                System.out.println("かなり太りすぎ");
            } else if ((bmi >= 23) && (bmi < 27)) {
                System.out.println("ちょっと太り気味");
            } else if ((bmi >= 21) && (bmi < 23)) {
                System.out.println("ちょうど良いバランス");
            } else if ((bmi >= 18) && (bmi < 21)) {
                System.out.println("ちょっとやせ気味");
            } else if (bmi < 18) {
                System.out.println("やせ気味");
            }


        } catch(NumberFormatException e) {
            System.err.println("身長（cm）、体重（kg）の順に入力してください。");
        }
    }

}
