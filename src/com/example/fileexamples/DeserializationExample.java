package com.example.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class DeserializationExample {
	public static void main(String[] args) {
		//step1:read data from input json file

		try (Reader reader = new FileReader("C:\\Users\\Sujatha\\Documents\\book-store.json")) {
			BufferedReader br = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			//step2:convert json into a string
			String json = sb.toString();
			//System.out.println(json);
			
			Gson gson=new Gson();
			//step3:convert json string to java jbookstore object(deserilization)
			JBookStore obj=gson.fromJson(json,JBookStore.class);
			//System.out.println(obj.getBookstore());
			//step4:print each jbook object
			for(JBook book:obj.getBookstore().getBooks()) {
				System.out.println(book);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
