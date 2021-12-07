import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.util.ArrayList;

public class SpiderPTT {
    public static void main(String[] args) throws IOException {

//        Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
//        Elements items = doc.getElementsByClass("b-ent");
//        System.out.println(doc.title());
//
//        for (Element item1 : items) {
//
//            String Num = item1.getElementsByClass("board-name").get(0).text();//"C_Chat";
//            String title = item1.getElementsByClass("board-title").get(0).text();
//            Document doc1 = Jsoup.connect("https://www.ptt.cc/bbs/" + Num + "/index.html").get();
//            Elements newsHeadlines = doc.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");
//            System.out.println("Board: " + Num);
//            System.out.println("Article title: " + title);
//
//            for (Element headline : newsHeadlines){
//
//                Elements items1 = doc1.getElementsByClass("r-ent");
//
//                for (Element item2 : items1){
//
//                    String Num1 = item2.getElementsByClass("title").get(0).text();
//                    System.out.println(Num1);
//                    Document doc2 = Jsoup.connect(headline.absUrl("href")).get();
//                    Elements items2 = doc2.getElementsByClass("push");
//
//                    for (Element item3 : items2){
//
//                        String num2 = item3.getElementsByClass("push").get(0).getElementsByTag("span").get(2).text();
//                        System.out.println("comment" + num2);
//                        break;
//
//                    }
//                    break;
//                }
//                break;
//            }
//
//        }


//        try{
        Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
        Elements Articletitle = doc.getElementsByClass("b-ent");
        System.out.println(doc.title());

        for (Element Atitle : Articletitle) {

            String item = Atitle.getElementsByClass("board-name").get(0).text();
            System.out.println("Board:" + item);
            String Text = Atitle.getElementsByClass("board-title").get(0).text();
            System.out.println("Article title:" + Text);
            String Url = Atitle.select("a").get(0).absUrl("href");
            Elements link = doc.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");
            System.out.println(Url);
            Document doc1 = Jsoup.connect(Url).get();

            for (Element links : link) {

                Elements items = doc1.getElementsByClass("r-ent");

                for (Element item1 : items) {

                    String test = item1.select("a").get(0).absUrl("href");
                    Document doc2 = Jsoup.connect(links.absUrl("href")).get();
                    Elements item2 = doc2.getElementsByClass("push");

                    for (Element item3 : item2) {

                        String comment1 = item3.getElementsByClass("push").get(0).select("span").get(1).text();
                        String comment2 = item3.getElementsByClass("push").get(0).select("span").get(2).text();
                        System.out.println("comment:" + comment1 + comment2);

                    }

                }

            }

        }





//        catch(Exception e) {
//
//            System.out.println(e);
//
//        }

    }
}
