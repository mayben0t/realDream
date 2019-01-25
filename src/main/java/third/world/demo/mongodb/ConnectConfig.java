//package third.world.demo.mongodb;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @program: demo
// * @description:
// * @author: WangX
// * @create: 2018-12-16 18:54
// **/
//public class ConnectConfig {
//
//    public static void main(String[] args){
//        try {
//            //连接到mongodb
//            MongoClient mongoClient = new MongoClient("localhost",27017);
//
//            //连接到数据库
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");
//            System.out.println("Connect to database successfully");
//
////            mongoDatabase.createCollection("test");
////            System.out.println("集合创建成功");
//
//            MongoCollection<Document> collection = mongoDatabase.getCollection("test");
//            System.out.println("集合test选择成功");
//
//            Document document = new Document("title","userInfo").
//                    append("name","black wang")
//                    .append("age","18")
//                    .append("favorite","computer");
//            List<Document> documentList = new ArrayList<>();
//            documentList.add(document);
//            collection.insertMany(documentList);
//            System.out.println("文档插入成功");
//
//        }catch (Exception e){
//            System.err.println(e.getClass().getName()+":"+e.getMessage());
//        }
//    }
//
//}
