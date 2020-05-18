/*
package com.mio.util.poi;

import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.mio.util.DateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

// * 功能描述：excel导出的封装类
// * SXSSF:当文件写入的流特别的大时候，会将内存中数据刷新flush到硬盘中，减少内存的使用量。
// * 起到以空间换时间作用，提供效率。针对 SXSSF Beta 3.8下，会有临时文件产生
// * 文件位置：java.io.tmpdir这个环境变量下的位置 Windows 7下是C:\Users\xxxxxAppData\Local\Temp Linux下是 /var/tmp/
// * @author ME
// * @date 2019/3/6
// * @param null
// * @return
//

public class SXSSFREMAIN {

	// 定义工作表
	private SXSSFWorkbook wb;
	// 定义工作表中的sheet
	private Sheet sh;
	// 定义保存在内存中的数量,-1表示手动控制
	private int flushRows;
//* 导出文件行数

	private int rownum;
//* 导出文件列数

	private int colnum;
//* 导出文件的存放路径

	private String filePath;
//* 下载导出文件的路径

	private String fileWebPath;
//*文件名称前缀
//
	private String filePrefix;
//*导出文件全路径

	private String fileAllPath;
//* 导出文件列标题

	private List<String> fieldNames;
//*导出文件每列代码，用于反射获取对象属性值

	private List<String> fieldCodes;
	public SXSSFWorkbook getWb() {
		return wb;
	}
	public void setWb(SXSSFWorkbook wb) {
		this.wb = wb;
	}
	public Sheet getSh() {
		return sh;
	}
	public void setSh(Sheet sh) {
		this.sh = sh;
	}
	public int getFlushRows() {
		return flushRows;
	}
	public void setFlushRows(int flushRows) {
		this.flushRows = flushRows;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileWebPath() {
		return fileWebPath;
	}
	public void setFileWebPath(String fileWebPath) {
		this.fileWebPath = fileWebPath;
	}
	public List<String> getFieldNames() {
		return fieldNames;
	}
	public void setFieldNames(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}
	public List<String> getFieldCodes() {
		return fieldCodes;
	}
	public void setFieldCodes(List<String> fieldCodes) {
		this.fieldCodes = fieldCodes;
	}
	public int getRownum() {
		return rownum;
	}
	public String getFilePrefix() {
		return filePrefix;
	}
	public void setFilePrefix(String filePrefix) {
		this.filePrefix = filePrefix;
	}
	public int getColnum() {
		return colnum;
	}
	public String getFileAllPath() {
		return fileAllPath;
	}
	public void setFileAllPath(String fileAllPath) {
		this.fileAllPath = fileAllPath;
	}

	private SXSSFREMAIN() {

	}

	// 反射方法，通过get方法获取对象属性
	private Object invokeMethod(Object owner, String fieldname, Object[] args) throws Exception {
		String methodName = "get" + fieldname.substring(0, 1).toUpperCase()
				+ fieldname.substring(1);
		Class ownerClass = owner.getClass();

		Class[] argsClass = new Class[args.length];

		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}

		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(owner, args);
	}


	public void writeDatasByString(List<String> datalist) throws Exception {
		rownum = rownum + 1;
		Row row = sh.createRow(rownum);
		int datalist_size = datalist.size();
		for (int cellnum = 0; cellnum < colnum; cellnum++) {
			Cell cell = row.createCell(cellnum);
			if(datalist_size>cellnum){
				cell.setCellValue(datalist.get(cellnum));
			}else{
				cell.setCellValue("");
			}
		}
	}

*/
/**
	 * 手动刷新方法,如果flushRows为-1则需要使用此方法手动刷新内存
	 * @throws Exception
	 *//*


	public void flush(int flushNum) throws Exception {
		((SXSSFSheet) sh).flushRows(flushNum);
	}
*/
/*
*
	 * 功能描述：字体设置
	 * 调用方式：fontStyle(18,true,IndexedColors.BLACK.getIndex(),"宋体")
	 * @author ME
	 * @date 2019/3/6
	 * @param fontSize	字体大小
	 * @param ifBold	是否加粗
	 * @param color	颜色
	 * @param ff	字体样式
	 * @return org.apache.poi.ss.usermodel.Font
	 *//*


	public Font fontStyle(int fontSize,boolean ifBold,short color,String ff){
		Font font = wb.createFont();
		font.setColor(color); // 设置字体颜色
		font.setFontHeightInPoints((short)fontSize);	// 字体大小
		font.setFontName(ff); // 字体样式
		font.setItalic(false); // 是否斜体
		font.setBold(ifBold); // 是否加粗
		font.setStrikeout(false); // 设置删除线
		return  font;
	}
*/
/*
*
	 * 功能描述：设置单元格样式
	 * 调用方式：
	 * @author ME
	 * @date 2019/3/6
	 * @param style
	 * @param color	单元格颜色
	 * @param bs 单元格边框
	 * @return org.apache.poi.ss.usermodel.CellStyle*//*



	public CellStyle gridStyle(CellStyle style,short color,BorderStyle bs){
		style.setWrapText(false);// 设置自动换行
		// 设置单元格颜色，如果color不等于1设置,=1背景颜色为空
		if(color!=1){
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

*/
/**
	 * 功能描述：导入excel标题
	 * 调用方式：
	 * @author ME
	 * @date 2019/3/6
	 * @param
	 * @return void
	 *//*


	private void writeTitles() throws Exception {
		rownum = 0; // 第0行
		colnum = fieldNames.size(); // 根据列标题得出列数
		sh.setDisplayGridlines(true); // 设置不显示excel线

		Row row = sh.createRow(rownum); // 创建行
		row.setHeightInPoints(15); // 设置行高

		CellStyle style = wb.createCellStyle();
//		sh.autoSizeColumn(colnum, true);
		for (int cellnum = 0; cellnum < colnum; cellnum++) {
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(fieldNames.get(cellnum));

			sh.setColumnWidth(0, 5000); // 设置列宽

			style.setFont(fontStyle(11,true,IndexedColors.BLACK.getIndex(),"宋体"));
			cell.setCellStyle(gridStyle(style,(short)1,BorderStyle.NONE));
		}
	}

*/
/**
	 * 向导出文件写数据
	 * @param datalist
	 * 存放Object对象，仅支持单个自定义对象，不支持对象中嵌套自定义对象
	 * @return*//*



	public void writeDatasByObject(List datalist) throws Exception {

		CellStyle style = wb.createCellStyle();
		for (int j = 0; j < datalist.size(); j++) {
			rownum = rownum + 1;
			Row row = sh.createRow(rownum);
			for (int cellnum = 0; cellnum < fieldCodes.size(); cellnum++) {
				Object owner = datalist.get(j);
				Object value = invokeMethod(owner, fieldCodes.get(cellnum),
						new Object[] {});
				Cell cell = row.createCell(cellnum);

				cell.setCellValue(fieldNames.get(cellnum));
				style.setFont(fontStyle(10,false,IndexedColors.BLACK.getIndex(),"宋体"));
				cell.setCellStyle(gridStyle(style,(short)1,BorderStyle.NONE));
				cell.setCellStyle(style);

				cell.setCellValue(value!=null?value.toString():"");
			}
		}
	}

*/
/**
	 * 导出文件
	 * @throws Exception*//*



	public String exportFile() throws Exception {
//		String filename = filePrefix+"_"+MyUtil.getCurrentTimeStr() + ".xlsx";
		String filename = filePrefix+"_"+DateUtil.getCurrentDatess()+".xlsx";
		FileOutputStream out = new FileOutputStream(filePath + filename);
		wb.write(out);
		out.flush();
		out.close();
		setFileAllPath(fileWebPath + filename);
		return fileWebPath + filename;
	}

*/
/*
*
	 * 开始导出方法
	 * @param filePath
	 *            导出文件存放物理路径
	 * @param fileWebPath
	 *            导出文件web下载路径
	 * @param filePrefix
	 *            导出文件名的前缀
	 * @param flushRows
	 *            存放在内存的数据量
	 * @param fieldNames
	 *            导出文件列标题
	 * @param fieldCodes
	 * 			  导出数据对象的字段名称
	 * @param flushRows
	 * 			写磁盘控制参数
	 * @return
	 *//*


	public static SXSSFREMAIN start(String filePath, String fileWebPath, String filePrefix,
									List<String> fieldNames, List<String> fieldCodes,
									int flushRows) throws Exception {
		SXSSFREMAIN SXSSFREMAIN = new SXSSFREMAIN();
		SXSSFREMAIN.setFilePath(filePath);
		SXSSFREMAIN.setFileWebPath(fileWebPath);
		SXSSFREMAIN.setFilePrefix(filePrefix);
		SXSSFREMAIN.setFieldNames(fieldNames);
		SXSSFREMAIN.setFieldCodes(fieldCodes);
		SXSSFREMAIN.setWb(new SXSSFWorkbook(flushRows));//创建workbook
		SXSSFREMAIN.setSh(SXSSFREMAIN.getWb().createSheet());//创建sheet
		SXSSFREMAIN.writeTitles();
		return SXSSFREMAIN;
	}

	public static void main(String[] args) throws Exception {
		//导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/";
		//导出文件的前缀
		String filePrefix="软件详情";
		//-1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows=100;
		//定义导出数据的title
		List<String> fieldNames=new ArrayList<String>();
		fieldNames.add(" 啊啊啊");
		fieldNames.add("通用名");
		fieldNames.add("价格");

		//告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes=new ArrayList<String>();
		fieldCodes.add("bm");//药品流水号
		fieldCodes.add("mc");//通用名
		fieldCodes.add("price");//价格



		//注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应


		//开始导出，执行一些workbook及sheet等对象的初始创建
		SXSSFREMAIN SXSSFREMAIN =
				SXSSFREMAIN.start(filePath, "/upload/",
						filePrefix, fieldNames, fieldCodes, flushRows);



		//准备导出的数据，将数据存入list，且list中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
//		List<Ypxx> list = new ArrayList<Ypxx>();
//		Ypxx ypxx1 = new Ypxx("001", "青霉素", 5);
//		Ypxx ypxx2 = new Ypxx("002", "感冒胶囊", 2.5f);
//		Ypxx ypxx3 = new Ypxx("003", "感冒胶囊", 2.5f);
//		list.add(ypxx1);
//		list.add(ypxx2);
//		list.add(ypxx3);
//
//		List<Ypxxss> lists = new ArrayList<Ypxxss>();
//		Ypxxss ypxx1s = new Ypxxss("001ss", "青霉素", 5);
//		Ypxxss ypxx2s = new Ypxxss("002ss", "感冒胶囊", 2.5f);
//		Ypxxss ypxx3s = new Ypxxss("003ss", "感冒胶囊", 2.5f);
//		lists.add(ypxx1s);
//		lists.add(ypxx2s);
//		lists.add(ypxx3s);

		//执行导出
//		SXSSFREMAIN.writeDatasByObject(list);
//		excelExportSXSSFs.writeDatasByObject(lists);

		//输出文件，返回下载文件的http地址

		String webpath = SXSSFREMAIN.exportFile();
//		String webpaths = excelExportSXSSFs.exportFile();
		System.out.println(webpath);

	}

}
*/
