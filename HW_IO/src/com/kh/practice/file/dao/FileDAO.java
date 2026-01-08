package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {

		FileReader fr = null;
		boolean how = false;

		try {
			fr = new FileReader(file);

			if (fr == null) {

				how = true;
			}else {
				
				how = false;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			how = true;
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return how;
	}

	public void fileSave(String file, String s) {
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);

			fw.write(s);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public StringBuilder fileOpen(String file) {

		return null;
	}

	public void fileEdit(String file, String s) {

	}

}
