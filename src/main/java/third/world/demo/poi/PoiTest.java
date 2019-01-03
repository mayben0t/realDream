package third.world.demo.poi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/3
 **/
public class PoiTest {

    public List<Area> importXLS() {
        ArrayList<Area> list = new ArrayList<>();
        try {
            //1.获取文件输入流
            InputStream inputStream = new FileInputStream("D:/area.xls");
            //2.获取Excel工作簿对象
            HSSFWorkbook  workbook = new HSSFWorkbook(inputStream);
            //3.得到Excel工作表对象
            HSSFSheet sheetAt = workbook.getSheetAt(0);
            //4.循环读取表格数据
            for(Row row:sheetAt){
                //首行（即表头）不读取
                if(row.getRowNum() == 0){
                    continue;
                }
                //读取当前行中单元格数据，索引从0开始
                if(row.getCell(0)!=null) {
                    row.getCell(0).setCellType(CellType.STRING);
                }
                String id = row.getCell(0).getStringCellValue();
                String name = row.getCell(1).getStringCellValue();
                Area area = new Area();
                area.setId(id);
                area.setName(name);
                list.add(area);
            }
            workbook.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }



    public static void main(String[] args){
        List<Area> areaLs = new PoiTest().importXLS();
        for(Area area:areaLs){
            System.out.println(area.toString());
        }
    }
}
