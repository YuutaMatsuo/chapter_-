package file_operate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File03 {
	public static void main(String[] args) {
		// ■ファイル操作（バイナリファイルの書き込み偏）
		try (FileOutputStream fos = new FileOutputStream("C:\\test\\test_01_binary.txt");) {
			fos.write('a');
			fos.write('b');
			fos.write('c');
			fos.write(65);
//			fos.write("こんにちは");
			// FileOutputStream+のwriteメソッドではString型の指定NG
			fos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// ■ファイル操作（バイナリファイルの読み取り偏）
		try (FileInputStream fis = new FileInputStream("C:\\\\test\\\\test_01_binary.txt")) {
			while (true) {
				int c = fis.read(); // 1バイト読む（戻り値はint型）
				if (c == -1) break;

				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
