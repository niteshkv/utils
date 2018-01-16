package com.utils;

import java.io.File;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class MergePDFs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergePDFs().combine();
	}
	
	public void combine()
    {
        try
        {
        PDFMergerUtility mergePdf = new PDFMergerUtility();
        String folder ="folder_of_the_pdfs";
        File _folder = new File(folder);
        File[] filesInFolder;
        filesInFolder = _folder.listFiles();
        for (File string : filesInFolder)
        {
            mergePdf.addSource(string);    
        }
    mergePdf.setDestinationFileName(folder + "/Combined.pdf");
    mergePdf.mergeDocuments();
        }
        catch(Exception e)
        {

        }  
    }

}
