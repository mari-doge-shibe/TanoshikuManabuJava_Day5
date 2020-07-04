package academy.learnprogramming;

import java.rmi.ServerError;

public class Practice3 {
    // コマンドラインから２つの数値を読み込んで、大きい方を表示するプログラムを作成
    // 条件演算子?値1:値2を使うこと
    public static void main(String[] args) {
        double num1, num2, big;
        if(!(args.length == 2)) {
            System.err.println("引数を２つ指定してください。");
            System.exit(1);
        }
        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
            big = (num1 < num2)?num2:num1;
            System.out.println(big);

        } catch (NumberFormatException e) {
            System.err.println("数値を入力してください。");
        }
    }


}
