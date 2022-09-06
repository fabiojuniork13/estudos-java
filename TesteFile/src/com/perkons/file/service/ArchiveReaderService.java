package com.perkons.file.service;

import java.io.File;
import java.util.List;

import com.perkons.file.controller.ArchiveReader;
import com.perkons.file.util.DiretoryConst;

public class ArchiveReaderService {
	
	public static List<Object> ArchiveOrFoldersReader() {
		return ArchiveReader.findAllFilesInFolderByFolder(DiretoryConst.FOLDER);
	}
	
	public static List<Object> EspecifyArchiveOrFoldersReader(String diretory) {
		File file = new File(diretory);
		return ArchiveReader.findAllFilesInFolderByFolder(file);
	}

}
