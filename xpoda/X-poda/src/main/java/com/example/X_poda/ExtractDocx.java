package com.example.X_poda;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ExtractDocx {
    public static void main(String[] args) {
        try {
            File file = new File("file1.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(document);
            String text = extractor.getText();
            System.out.println(text.replaceAll("\\.\\s*", ".\n"));
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
