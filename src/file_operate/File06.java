package file_operate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File06 {
	public static void main(String[] args) {
		// ■ファイル操作（バッファリングフィルタ書き込み編）
		// try-with-resources文で記述する

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test\\test_02.txt", true))) {
			bw.write("あけましておめでとう");
			bw.write('謹');
			bw.write('賀');
			bw.write('新');
			bw.write('年');
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// try-with-resources文でファイル書き込み処理を行っているので
		// close()の記述や、それに伴うfinally{}が不要になる
	}
}
