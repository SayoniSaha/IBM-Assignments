package project18_30jun;

import java.io.*;

public class FileIO {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("src\\input.txt");
			try {
				FileWriter output = new FileWriter("src\\output.txt");
				try {
					char[] buffer = new char[128];
					int read;

					read = input.read(buffer);
					while (read != -1) {
						output.write(buffer, 0, read);

						read = input.read(buffer);
					}

				} finally {
					output.close();
				}
			} finally {
				input.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}