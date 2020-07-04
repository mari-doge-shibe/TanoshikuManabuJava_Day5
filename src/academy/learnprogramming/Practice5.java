package academy.learnprogramming;

public class Practice5 {
    // 100以上200未満のランダムな奇数を配列に入れるプログラム
    // コマンドライン引数で奇数の数を指定
    public static void main(String[] args) {

        try{
            int max = Integer.parseInt(args[0]);
            int[] random = new int[max];
            int index = 0;
            int num;

            while(true) {
                num = (int)(Math.random() * 200);
                if((num % 2) == 0) {
                    continue;
                }
                if(num < 100) {
                    continue;
                }
                random[index++] = num;
                System.out.println(num);
                if(index >= max) {
                    break;
                }
            }

        } catch(Exception e) {
            System.err.println("整数を入力してください。");
        }

    }


}
