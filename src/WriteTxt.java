/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package write;

/**
 *
@author Hikma Farah Ali
 */




import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteTxt {


	public static void main(String[] args) {

		List<OpenTxt> Write = Arrays.asList(
				
				new OpenTxt("Tiga", "isss","THREE"),
				new OpenTxt( "Dua", "iss","Two"),
				new OpenTxt( "Sau", "is","One"));

		FileWriter fileWriter = null;
                

		try {
			fileWriter = new FileWriter("B.txt");

			fileWriter.append('\n');

			for (OpenTxt customer : Write) {

				fileWriter.append(customer.getWord());
				fileWriter.append(',');
				fileWriter.append(customer.getAnd());
				fileWriter.append(',');
                                fileWriter.append(customer.getMeaning());
				fileWriter.append(',');
				fileWriter.append('\n');
			}

			System.out.println("Write txt successfully!");
		} catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Flushing/closing error!");
				e.printStackTrace();
			}
		}
	}
}
