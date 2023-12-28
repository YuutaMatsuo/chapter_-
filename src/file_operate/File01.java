package file_operate;

import java.io.FileWriter;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		// ■ファイル操作（書き込み偏）
		FileWriter fw = null;
		try {
			// new FileWriter("ファイルパス") ...パターン①（引数が１つ）
			// new FileWriter("ファイルパス", 書き込みモード） ...パターン②（引数２つ）
			// モード選択：true → 追記 / false → 上書き

			// ■追記モード
			fw = new FileWriter("C:\\test\\test_01.txt", true);

			// データの書き込みを「要求する」だけのwriteメソッド
			fw.write('H'); // 一文字を記述（char型）
			fw.write('E');
			fw.write('L');
			fw.write('L');
			fw.write('O');
			fw.write(" WORLD"); // 文字列を記述（String型）
			fw.write(33); // int型の数値を指定して、対応する文字を書き込む
			// 「３３」のASCIIコードは文字「！」に変換される
			
			fw.write("hello world!!");
			fw.write(System.lineSeparator()); // 改行コードをString型で返す
			// 「\n」を使うことでも改行することが可能
			fw.write("END");
			
			// データの書き込みを即座に行う
			// writeメソッドを使ったら最後にflushメソッドを使う
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
