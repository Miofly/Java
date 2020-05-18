package com.mio.util.poi;

import com.mio.test.pojo.Person;
import com.mio.util.DateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * 功能描述：XSSF导出excel表格，分多个sheet导出
 * @author ME
 * @date 2019/3/12
 */
public class ExcelExportXSSF {

    /***
     * 功能描述：调用测试案列，需配置tomcat虚拟路径
     * 调用方式：直接复制到controller调用
     * @author ME
     * @date 2019/3/12
     * @param
     * @return void
     */
    @Test
    public void testPOI()  throws Exception {
        ExcelExportXSSF export = new ExcelExportXSSF();
        // 表格输出路径
        String filePath = "e:/upload/";
        // 导出文件的前缀
        String filePrefix = "软件详情";
        // 文件完整名称加上日期
        String filename = filePrefix + "_" + DateUtil.getCurrentDatess() + ".xlsx";
        // tomcat虚拟路径
        String fileWebPath = "/upload/";
        // 输出的文件地址及名称
        OutputStream out = new FileOutputStream(filePath + filename);
        // 创建workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // 首个sheet页
        // sheet表中的标题行内容
        String[] customName = {"系统名称1111111", "活动名称", "门店号"};
        // 数据库映射字段
        String[] pojoName = {"name", "age", "job" };
        // list数据集合
        List<Person> listaaa = new ArrayList<>();
        listaaa.add(new Person("张sssdsssssssssss", 15, "学生"));

        // 第二个sheet页
        String[] customName1 = {"tabCod中文", "tabName", "tabOrder", "tabStatus" };
        String[] pojoName1 = {"tabCode", "tabName", "tabOrder", "tabStatus" };
//        List<SoftwareTab> list = softService.selectTypeName();

        //第一个表格内容
        export.exportExcel(workbook, 0, "日报汇总",
                listaaa, pojoName, customName, out);
        // 第二个表格内容
//        export.exportExcel(workbook, 1, "日报1213汇总",
//                list, pojoName1, customName1, out);
        //将所有的数据一起写入，然后再关闭输入流。
        workbook.write(out);
        out.flush();
        out.close();
        /*提供下载*/
        /*return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
                Config.MESSAGE, 313, new Object[] {
                        list.size(),
                        fileWebPath+filename//下载地址
        }));*/
    }

    /***
     * 功能描述：导出方法
     * 调用方式：
     * @author ME
     * @date 2019/3/12
     * @param workbook  表格
     * @param sheetNum  sheet页num
     * @param sheetTitle    sheet页名称
     * @param dataSet   list数据
     * @param params    pojo字段
     * @param headers   标头标题
     * @param out   输出
     * @return void
     */
    public<T> void exportExcel(XSSFWorkbook workbook, int sheetNum, String sheetTitle,
                               Collection<T> dataSet, String[] params,
                               String[] headers, OutputStream out) throws Exception {
        // 创建工作表sheet
        XSSFSheet sheet = workbook.createSheet();
        // 多个sheet页，num和标题
        workbook.setSheetName(sheetNum, sheetTitle);
        // 设置样式
        XSSFCellStyle style = workbook.createCellStyle();
        // 设置标题字体
        style.setFont(fontStyle(workbook, 11, true, IndexedColors.BLACK.getIndex(), "宋体"));
        // 创建第一行
        XSSFRow row = sheet.createRow(0);
        // 产生表格标题行
        for (int i = 0; i < headers.length; i++) {
            XSSFCell cell = row.createCell((short) i);
            // 设置单元格标头样式
            cell.setCellStyle(gridStyle(style, (short) 1, BorderStyle.NONE));
            XSSFRichTextString text = new XSSFRichTextString(headers[i]);
            cell.setCellValue(text.toString());
        }

        // 存储每一行的数据
        int idx = 1;
        List<String[]> list = new ArrayList<>();
        for (Object obj : dataSet) {
            // 获取到每一行的属性值数组
            list.add(getValues(obj, params));
        }
        // 输出具体数据
        // 内容的字体和单元格样式
        XSSFCellStyle style1 = workbook.createCellStyle();
        style1.setFont(fontStyle(workbook, 10, false, IndexedColors.BLACK.getIndex(), "宋体"));
        for (String[] strings : list) {
            XSSFRow nrow = sheet.createRow(idx++);
            XSSFCell ncell = null;
            for (int i = 0; i < strings.length; i++) {
                ncell = nrow.createCell(i);
                ncell.setCellStyle(gridStyle(style1, (short) 1, BorderStyle.NONE));
                ncell.setCellValue(strings[i]);
            }
        }
        // 列宽
        // sheet.setDefaultColumnWidth((short) 40);
        // 设置自动列宽
        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 16 / 10);
        }

    }

    /***
     * 功能描述：字体设置
     * 调用方式：fontStyle(18,true,IndexedColors.BLACK.getIndex(),"宋体")
     * @author ME
     * @date 2019/3/12
     * @param workbook
     * @param fontSize  字体大小
     * @param ifBold    是否加粗
     * @param color 颜色
     * @param ff 字体样式
     * @return org.apache.poi.ss.usermodel.Font
     */
    public Font fontStyle(XSSFWorkbook workbook, int fontSize, boolean ifBold, short color, String ff) {
        XSSFFont font = workbook.createFont();
        font.setColor(color); // 设置字体颜色
        font.setFontHeightInPoints((short) fontSize);	// 字体大小
        font.setFontName(ff); // 字体样式
        font.setItalic(false); // 是否斜体
        font.setBold(ifBold); // 是否加粗
        font.setStrikeout(false); // 设置删除线
        return  font;
    }

    /**
     * 功能描述：设置单元格样式
     * 调用方式：gridStyle(style,(short)1,BorderStyle.NONE) 无边框无背景颜色
     *         gridStyle(style,IndexedColors.BLUE.getIndex(),THIN) 边框背景颜色
     * @author ME
     * @date 2019/3/12
     * @param style
     * @param color 单元格颜色
     * @param bs 单元格边框
     * @return org.apache.poi.ss.usermodel.CellStyle
     */
    public CellStyle gridStyle(CellStyle style, short color, BorderStyle bs) {
        style.setWrapText(false); // 指定当单元格内容显示不下时自动换行
        // 设置单元格颜色，如果color不等于1设置
        if (color != 1) {
            style.setFillBackgroundColor(color);
            style.setFillPattern(FillPatternType.FINE_DOTS);
        }
        style.setAlignment(HorizontalAlignment.CENTER);	 // 水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中

        // 边框 THIN MEDIUM THICK DOUBLE
        style.setBorderBottom(bs);
        style.setBorderRight(bs);
        style.setBorderTop(bs);
        style.setBorderLeft(bs);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());

        return style;
    }

    /*对象属性的反射方法*/
    public static String[] getValues(Object object, String[] params) {
        String[] values = new String[params.length];
        try {
            for (int i = 0; i < params.length; i++) {
                Field field = object.getClass().getDeclaredField(params[i]);
                // 设置访问权限为true
                field.setAccessible(true);
                // 获取属性
                // 如果属性有涉及基本变量的做一个转换
                if (field.getType() == org.apache.bcel.generic.Type.INT.getClass()) {
                    values[i] = String.valueOf((int) field.get(object));
                    values[i] = field.get(object).toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return values;
    }
}
