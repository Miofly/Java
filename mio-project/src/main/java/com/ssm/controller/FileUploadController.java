package com.ssm.controller;

import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.util.MyUtils;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;


@Controller
public class FileUploadController {

    @Value("${SOFT_UPLOAD_PATH}")
    private String SOFT_UPLOAD_PATH;

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

   /* @RequestMapping("/uploads")
    public String uploads(@RequestParam MultipartFile[] myfiles,HttpServletRequest request) throws IOException
    {
        //如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解
        //如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解
        //并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件

        for(MultipartFile myfile : myfiles){
            if(myfile.isEmpty()){
                System.out.println("文件未上传");
            }else{
                System.out.println("文件长度: " + myfile.getSize());
                System.out.println("文件类型: " + myfile.getContentType());
                System.out.println("文件名称: " + myfile.getName());
                System.out.println("文件原名: " + myfile.getOriginalFilename());
                System.out.println("========================================");
                //如果用的是Tomcat服务器，则文件会上传到
//                {服务发布位置}\\WEB-INF\\upload\\文件夹中
                String realPath = request.getSession().getServletContext().getRealPath("/upload");
                System.out.println(realPath);
                String realPath1 = "C:\\Users\\MIO\\Desktop\\DownloaderServer";

                //这里不必处理IO流关闭的问题，
                // 因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，
                FileUtils.copyInputStreamToFile(myfile.getInputStream(),
                        new FileUtils(realPath1, myfile.getOriginalFilename()));
            }
        }

        return "/login";
    }

    @RequestMapping("/upload")
    public @ResponseBody
    SubmitResultInfo upload(MultipartFile myfile, HttpServletRequest request) throws Exception{
      //如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解
      //如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解
      //并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件
*//*      if(myfile.isEmpty()){
          CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 200, null));

      }else{

      }*//*
      System.out.println("文件长度: " + myfile.getSize());
      System.out.println("文件类型: " + myfile.getContentType());
      System.out.println("文件名称: " + myfile.getName());
      System.out.println("文件原名: " + myfile.getOriginalFilename());
      System.out.println("========================================");
      //如果用的是Tomcat服务器，则文件会上传到 {服务发布位置}\\WEB-INF\\upload\\文件夹中
//      String realPath = request.getSession().getServletContext().getRealPath("/upload");
//      System.out.println(realPath);
      String realPath1 = "C:\\Users\\MIO\\Desktop\\DownloaderServer";

      //这里不必处理IO流关闭的问题，
      // 因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，
      FileUtils.copyInputStreamToFile(myfile.getInputStream(),
              new FileUtils(realPath1, myfile.getOriginalFilename()));

      return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }*/


    // 单文件上传
    @RequestMapping("/upload")
    public @ResponseBody
    SubmitResultInfo upload(@RequestParam("file") CommonsMultipartFile file) throws Exception {

        /*文件是否为空判断*/
        if (file.isEmpty()) {
            return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 301, null));
        }

//          String path = "/opt/apache-tomcat-7/webapps/DownloaderServer/downloadFile/";
        String path = SOFT_UPLOAD_PATH;
//        String path = "C:/Users/MIO/Desktop/";

        // 文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传文件：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("文件名后缀：" + suffixName);
        logger.info("文件类型：" + file.getContentType());
        logger.info("文件大小：" + file.getSize() + "B||" + file.getSize() / 1024 + "KB||" + file.getSize() / 1024 / 1024 + "MB");
//        FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉
        FileUtils.copyInputStreamToFile(file.getInputStream(),
                new File(path, file.getOriginalFilename()));
        /*文件上传成功*/
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 300, null));
    }

    // 多文件上传
    @RequestMapping("/uploads")
    public @ResponseBody
    SubmitResultInfo upload2(@RequestParam(value = "file", required = false) CommonsMultipartFile file[]) throws Exception {
        logger.info("文件数量：" + file.length);

        for (int i = 0; i < file.length; i++) {

            String fileName = file[i].getOriginalFilename();
            logger.info("上传文件[" + new Integer(i + 1) + "]：" + fileName);
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            logger.info("文件名后缀[" + new Integer(new Integer(i + 1)) + "]：" + suffixName);
            logger.info("文件类型[" + new Integer(i + 1) + "]：" + file[i].getContentType());
            logger.info("文件大小[" + new Integer(i + 1) + "]：" + file[i].getSize() + "B||" + file[i].getSize() / 1024 + "KB||" + file[i].getSize() / 1024 / 1024 + "MB");

            if (!file[i].isEmpty()) {
                String path = "C:\\Users\\MIO\\Desktop\\DownloaderServer";
                FileUtils.copyInputStreamToFile(file[i].getInputStream(),
                        new File(path, file[i].getOriginalFilename()));
            } else {
                return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 301, null));
            }
        }
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 300, null));
    }

    @RequestMapping("/upload1")
    public @ResponseBody
    SubmitResultInfo upload1(MultipartFile file) throws Exception {
        MyUtils myUtils = new MyUtils();
        String path = "C:/Users/MIO/Desktop/";


        FileUtils.copyInputStreamToFile(file.getInputStream(),
                new File(path, file.getOriginalFilename()));
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }
}
