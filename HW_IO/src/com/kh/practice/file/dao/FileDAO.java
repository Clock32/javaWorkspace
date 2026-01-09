package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {

		File f = new File(file);
		boolean how = f.exists();
		
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
