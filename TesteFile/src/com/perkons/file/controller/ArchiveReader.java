package com.perkons.file.controller;
	
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.perkons.file.folder.Archive;
import com.perkons.file.folder.Folder;

public class ArchiveReader {
	
	static Folder folders = null;
	
//	public static void findAllFilesInFolder(File folder) {
//		for (File file : folder.listFiles()) {
//			if (!file.isDirectory()) {
//			
//				for(Folder archives : foldersList) {
//					
//						System.out.println(file.getAbsolutePath());
//					
//				}
//				
//				//findAllFilesInFolder(file);
//				
//			} 
//			else 
//			{
//				System.out.println("Is a folder: " + file.getPath());
//				folders = new Folder();
//				folders.setName(file.getPath());
//				foldersList.add(folders);
//				//findAllFilesInFolder(file);
//			}
//		}
//	}
	
	public static List<Object> findAllFilesInFolderByFolder(File folder) {
		List<Object> archivesOrFolders = new ArrayList<Object>();
		
		for (File file : folder.listFiles()) {
			if (!file.isDirectory()) {
				Archive archive = new Archive(file.getAbsolutePath());
				archivesOrFolders.add(archive);
			} 
			else 
			{
				System.out.println("Is a folder: " + file.getPath());
				folders = new Folder();
				folders.setName(file.getPath());
				archivesOrFolders.add(folders);
			}
		}
		
		return archivesOrFolders;
		
	}
	
	//testerrrr
	public static void main(String[] args) throws ParseException {
		
		File folder = new File("/home/perkons/Documents/SISTEMA_GALERIA/GALERIA_LITORAL/");
		List<Object> listFolders = findAllFilesInFolderByFolder(folder);
		
		for(Object foldes : listFolders) {
			if(foldes instanceof Folder) {
				Folder folderre = (Folder) foldes;
				System.out.println(folderre.getName());
			}
		}
		
		Scanner teclado = new Scanner(System.in);
		String busca = "";
		
		while(!busca.equals("sair")) {
			System.out.println("Qaul pasta? ");
			busca = teclado.next();
			
			File folder2 = new File(busca);
			
			List<Object> listFolders2 = findAllFilesInFolderByFolder(folder2);
			
			for (Object name : listFolders2) {
				System.out.println(name);
			}
		}
		
		teclado.close();
		
	}
}
