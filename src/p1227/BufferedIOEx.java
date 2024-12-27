package p1227;


import java.io.*;
import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.FileReader;

public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c ;
		try {
			fin = new FileReader("C:\\\\eclipse\\\\jee-2024-09\\\\eclipse\\\\project\\\\javaPrj\\\\src\\\\p1227\\\\test2.txt");
			//출력 버퍼크기를 5바이트로 설정
			BufferedOutputStream out = new
					BufferedOutputStream(System.out, 5);
			while ((c= fin.read()) != -1) { //파일의 끝에 도달하면 -1을 반환
				out.write(c);
			}
			
			//사용자 입력 대기
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		}catch (IOException e ) {
			e.printStackTrace();
		
		}
	}

}
