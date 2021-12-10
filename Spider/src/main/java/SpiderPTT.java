import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderPTT {
    public static void main(String[] args){





        try{
//        Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
//        Elements Articletitle = doc.getElementsByClass("b-ent");
//        System.out.println(doc.title());
//
//        for (Element Atitle : Articletitle) {
//
//            String item = Atitle.getElementsByClass("board-name").get(0).text();
//            System.out.println("Board:" + item);
//            String Text = Atitle.getElementsByClass("board-title").get(0).text();
//            System.out.println("Article title:" + Text);
//            String Url = Atitle.select("a").get(0).absUrl("href");
//            Elements link = doc.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");
////            System.out.println(Url);
//            Document doc1 = Jsoup.connect("https://www.ptt.cc/bbs/" + item + "/index.html").get();
//
//            for (Element links : link) {
//
//                Elements items = doc1.getElementsByClass("r-ent");
//
//                for (Element item1 : items) {
//
//                    String test = item1.select("a").get(0).absUrl("href");
//                    Document doc2 = Jsoup.connect(links.absUrl("href")).get();
//                    Elements item2 = doc2.getElementsByClass("push");
//
//                    for (Element item3 : item2) {
//
//                        String comment1 = item3.getElementsByClass("push").get(0).select("span").get(1).text();
//                        String comment2 = item3.getElementsByClass("push").get(0).select("span").get(2).text();
//                        System.out.println("comment:" + comment1 + comment2);
//                          break;
//
//                    }
//                      break;
//                }
//                  break;
//            }
//              System.out.print("\n");

        Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
        System.out.println(doc.title());
        Elements Text1 = doc.getElementsByClass("b-ent");

        for (Element Texts : Text1) {

            String Atitle = Texts.getElementsByClass("board-name").get(0).text();
            System.out.println("Board: " + Atitle);
            String title = Texts.getElementsByClass("board-title").get(0).text();
            System.out.println("Article title: " + title);
            Document doc1 = Jsoup.connect("https://www.ptt.cc/bbs/" + Atitle + "/index.html").get();
            Elements Url = doc1.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");

            for (Element Urls : Url) {

                Elements Text = doc1.getElementsByClass("r-ent");

                for (Element Url2 : Text) {

                    Document doc2 = Jsoup.connect(Urls.absUrl("href")).get();
                    Elements Push = doc2.getElementsByClass("push");

                    for (Element Pushs : Push) {
                        String Comment1 = Pushs.getElementsByClass("push").get(0).getElementsByTag("span").get(1).text();
                        String Comment2 = Pushs.getElementsByClass("push").get(0).getElementsByTag("span").get(2).text();
                        System.out.println("Comment:" + Comment1 + Comment2);
                        break;

                    }

                    break;

                }

                break;

            }

            System.out.print("\n");

        }

        }


        catch(Exception e) {

            System.out.println(e);

        }


    }
}
