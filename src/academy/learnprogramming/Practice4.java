package academy.learnprogramming;

public class Practice4 {
    // whileループをつかって、コマンドラインから任意の数の数値を読み込んで、その総和を表示するプログラム
    public static void main(String[] args) {
        int i = 0;
        double sum = 0;
        try{
            while(i < args.length) {
                double num = Double.parseDouble(args[i]);
                sum += num;
                i++;
            }
            System.out.println("総和：" + sum);

        }catch(NumberFormatException e) {
            System.err.println("数値を入力してください。");
        }
    }

}
