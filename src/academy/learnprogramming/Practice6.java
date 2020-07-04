package academy.learnprogramming;

import java.sql.SQLOutput;

public class Practice6 {
    // コマンドライン引数から複数の数値を読み込んで、最大値、最小値、平均を表示するプログラムをsortメソッドを使用せずに、ループとif文を使って作成
    public static void main(String[] args) {
        double max, min, sum;
        double[] array1;

        if(args.length == 0) {
            System.err.println("引数を指定してください");
            System.exit(1);
        }
        try{
            array1 = new double[args.length];
            for(int i = 0; i < args.length; i++) {
                array1[i] = Double.parseDouble(args[i]);
            }
            max = min = sum = array1[0];
            if(args.length > 1) {
                for(int i = 1; i < args.length; i++) {
                    sum += array1[i];
                    if(array1[1] < min) {
                        min = array1[i];
                    }
                    if(array1[i] > max) {
                        max = array1[i];
                    }
                }
                System.out.println("最小" + min);
                System.out.println("最大" + max);
                System.out.println("平均" + (sum / args.length));
            }

        } catch(NumberFormatException e) {
            System.out.println("数値を入れてください");

        }


    }

}
