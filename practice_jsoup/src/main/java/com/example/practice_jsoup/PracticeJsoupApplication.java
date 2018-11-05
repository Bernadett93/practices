package com.example.practice_jsoup;

import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeJsoupApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeJsoupApplication.class, args);

        HtmlToPlainText htmlToPlainText=new HtmlToPlainText();
        System.out.print(htmlToPlainText.setHtmlFrameToHtmlContent(""));
    }
}
