package com.CreationalDesignPatterns.FactoryMethodPatternEx1;

public class PDFDocumentFactory extends DocumentFactory {
	 
	public Document createDocument() {
        return new PDFDocument();
    }

}
