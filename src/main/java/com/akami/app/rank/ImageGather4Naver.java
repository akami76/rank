package com.akami.app.rank;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class ImageGather4Naver {
    public static void main(String[] args) {
        ImageGather4Naver imageGet = new ImageGather4Naver();
        imageGet.getImageGather4Naver("네이처셀");

    }

    public List<String> getImageGather4Naver(String keyword){
        Document doc;
        List<String> getImageMap = new ArrayList<String>();
        int positionIdex = 0;
        try {
            doc = Jsoup.connect("https://search.naver.com/search.naver?where=image&query="+URLEncoder.encode(keyword, java.nio.charset.StandardCharsets.UTF_8.toString())).get();
            System.out.println(doc);
            //System.out.println("==========");
            Elements imges = doc.select("img");
            //System.out.println(imges);
            //imges.attr("data-source");
            //System.out.println("*******");
            //System.out.println(imges.attr("data-source"));

            for (Element e : imges) {

                if(!e.attr("data-source").isEmpty()){

                    if(positionIdex < 3){
                        //System.out.println("imges : "+e.attr("data-source"));
                        getImageMap.add( e.attr("data-source"));
                        //System.out.println("SIZE : "+getImageMap.size());
                        //System.out.println("SIZE : "+getImageMap);

                    }else{
                        return getImageMap;
                    }

                    //System.out.println(e.attr("data-source"));
                    //System.out.println(getImageMap.size());
                    positionIdex++;
                }

            }


        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return getImageMap;

    }
}
