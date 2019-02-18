//package third.world.demo.pachong;
//
///**
// * @Author WangXiao
// * @Description TODO
// * @Date 2019/2/13
// **/
//
//import com.boka.library.util.Assert;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.*;
//import java.nio.charset.Charset;
//import java.util.List;
//
//public class Test {
//
//    public static void main(String[] args) throws Exception{
//        BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/haoduan.txt")));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/main/resources/resource.txt")));
//        String mobile = reader.readLine();
//
//        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("gb2312"));
//        RestTemplate template = new RestTemplateBuilder().additionalMessageConverters(m).build();
//
//        while (Assert.isNotNull(mobile)){
//            try {
//                String url = "http://www.ip138.com:8080/search.asp?mobile="+mobile+"&action=mobile";
//                String htmlTxt = template.getForObject(url,String.class);
//                Document document = Jsoup.parse(htmlTxt);
//                List<Element> elements = document.select("table");
//                Element element = elements.get(1);
//                String txt = element.select("tr").get(2).select("td").get(1).text().replaceAll(" "," ").replaceAll("市","").replaceAll("省","");
//                if(Assert.isNotNull(txt)){
//                    String[] provinceAndCity = txt.split(" ");
//                    if(provinceAndCity.length == 1){
//                        txt = txt + "" + txt;
//                    }
//                }
//                if(Assert.isNotNull(txt)){
//                    writer.write(mobile + " " + txt);
//                    writer.newLine();
//                    writer.flush();
//                }
//            }catch (Exception e){
//
//            }
//            mobile = reader.readLine();
//            Thread.sleep(1500);
//        }
//        writer.close();
//        reader.close();
//    }
//}