package com.zensar.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {
		File file=new File("D://MyFile.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		try(FileReader fin=new  FileReader(file);
				FileWriter fout=new FileWriter(file)){
			int str;
			while(((str=System.in.read())!='\n')){
				
				fout.write(str);
			}
			
			
			while((str=fin.read())==-1){
				System.out.print((char)str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
