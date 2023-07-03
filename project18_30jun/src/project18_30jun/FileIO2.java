package project18_30jun;

import java.io.*;

public class FileIO2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=null;
		BufferedWriter bufferedWriter=null;
		
		try {
			FileReader reader=new FileReader("src\\input.txt");
			bufferedReader=new BufferedReader(reader);
			
			FileWriter writer=new FileWriter("src\\\\output.txt");
			
			bufferedWriter=new BufferedWriter(writer);
			String line=null;
			line=bufferedReader.readLine();
			while(line !=null)
			{
				bufferedWriter.write(line, 0, line.length());
				bufferedWriter.newLine();
				line=bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			bufferedWriter.close();
			bufferedWriter.close();
		}
	}
}
