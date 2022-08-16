package fizzbuzz;

import java.util.Random;

public class Fizzbuzz_for {
 public static void main(String arms[]) {
	Random rand = new Random();
      int i = rand.nextInt(100) + 1;

      System.out.println(i);

   for(int number = 0 ; number < i; number++) {

	   int n = rand.nextInt(100) + 1;
		System.out.println(n);


        if(i % 3 == 0 || i % 5 == 0) {
          System.out.println("FizzBuzz");
        }

        else if (i % 3 == 0) {
          System.out.println("Fizz");
        }

        else if (i % 5 == 0) {
          System.out.println("Buzz");
        }

        else {
          System.out.println(i);
        }

      }

    }

  }

/*
 * for (①初期化式; ②条件式; ④反復式) {
	// ③処理部
}
この順で処理される。
 *
 * for(int number = 0 ; number < i; number++) {
 意味としては、
 * 1 int numberという変数をセットします。初期値は0です
 * 2 numberは、事前セットした変数iより小さい場合、
 * 3 int n以下の処理を実行します
 * 4 処理が終わるごとに、変数numberに1を足していきます
 * →変数numberと変数iが等しくなった(=条件式と合致しなくなった)時に、処理を終了します
 *   */