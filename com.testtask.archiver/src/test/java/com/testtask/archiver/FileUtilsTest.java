package com.testtask.archiver;


import org.junit.Test;

import java.io.IOException;


public class FileUtilsTest {
	
	private final String FILE_TO_ZIP = "src/main/doc/Liza_Seledtsova.text";
	private final String FILE_TO_ZIPPED ="src/main/doc/ar1.zip";
	private final String ZIP_FILE = "src/main/doc/ar1.zip";
	private final String EXTRACT_FOLDER = System.getProperty("user.dir");
	private final String ARCHIVE_FOLDER = System.getProperty("user.dir");

	@Test
	public void testZipFile() throws IOException {
		FileUtil.zip(FILE_TO_ZIP, FILE_TO_ZIPPED);
	}

	@Test
	public void testExtractFile() throws IOException {
		FileUtil.extract(ZIP_FILE, EXTRACT_FOLDER);
	}

	//@Test
	public void testDeleteFile() throws IOException {
		FileUtil.delete(ZIP_FILE);
	}
	
	//@Test
	public void testArchiveFile() throws IOException {
		FileUtil.archive(ZIP_FILE, ARCHIVE_FOLDER);
	}



}
