package com.testtask.archiver;


import org.junit.Test;

import java.io.IOException;


public class FileUtilsTest {
	
	private final String FILE_TO_ZIP = "C:\\Users\\liza\\Desktop\\photo_2020-09-22_22-47-54.jpg";
	private final String FILE_TO_ZIPPED = "C:\\Users\\liza\\Desktop\\ar2.zip";
	private final String ZIP_FILE = "C:\\Users\\liza\\Desktop\\ar.zip";
	private final String EXTRACT_FOLDER = System.getProperty("user.dir");
	private final String ARCHIVE_FOLDER = "C:\\Users\\liza\\Desktop";

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

	//@Test
	public void testZipFile() throws IOException {
		FileUtil.zip(FILE_TO_ZIP, FILE_TO_ZIPPED);
	}
}
