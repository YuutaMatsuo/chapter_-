package file_operate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File04 {
	public static void main(String[] args) {
		// ■ファイル操作（バッファリングフィルタ書き込み編）
		BufferedWriter bw = null;
		try {
			// BufferedWriterのインスタンス化に、引数としてFileWriterインスタンスを指定する！
			// FileWriterにバッファリングフィルタを取り付けるイメージ
			bw = new BufferedWriter(new FileWriter("c:\\test\\test_02.txt", true));
			
			bw.write('H');
			bw.write('E');
			bw.write('L');
			bw.write('L');
			bw.write('O');
			bw.newLine(); // 書き込み中に改行（FileWriterでは不可）
			bw.write(" WORLD");
			bw.write(33);
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw == null) {
				try {
					bw.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
