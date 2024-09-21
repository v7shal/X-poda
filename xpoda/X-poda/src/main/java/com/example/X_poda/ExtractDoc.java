package com.example.X_poda;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class ExtractDoc {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\HP\\Desktop\\file1.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            WordExtractor extractor = new WordExtractor(document);
            String[] paragraphs = extractor.getParagraphText();
            for (String paragraph : paragraphs) {
                System.out.println(paragraph.replaceAll("\\.\\s*", ".\n"));
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

