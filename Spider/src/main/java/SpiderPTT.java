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

//        try{
            Document doc =  Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
            Elements Articletitle = doc.getElementsByClass("b-ent");
            System.out.println(doc.title());

                for (Element Atitle : Articletitle){

                    String item = Atitle.getElementsByClass("board-name").get(0).text();
                    System.out.println("Board:" + item);
                    String Text = Atitle.getElementsByClass("board-title").get(0).text();
                    System.out.println("Article title:" + Text);
                    String Url = Atitle.select("a").get(0).absUrl("href");
                    Elements link = Atitle.select("a href");
                    System.out.println(Url);

                        for (Element links : link) {

                            Document doc2= Jsoup.connect(String.valueOf(links)).get();
                            Elements AT = doc2.getElementsByClass("title");
                            String Test = doc2.select("a").get(0).absUrl("href");
                            System.out.println(AT);
                            System.out.println(Test);

                        }


        }


//        catch(Exception e) {
//
//            System.out.println(e);
//
//        }

    }
}
