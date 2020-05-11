package com.mio.controller;

import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;


@Controller
public class FileUploadController {
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
                        new File(realPath1, myfile.getOriginalFilename()));
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
              new File(realPath1, myfile.getOriginalFilename()));

      return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }*/


    // 处理上传的
    @RequestMapping("/upload")
    public @ResponseBody
    SubmitResultInfo upload(HttpServletRequest request, HttpServletResponse response,
                            @RequestParam("file") CommonsMultipartFile file) throws Exception {
        String path = "/opt/apache-tomcat-7/webapps/DownloaderServer/downloadFile/";
//        String path = "/usr/local/mio";
//        String path = "C:\\Users\\MIO\\Desktop\\DownloaderServer";
         FileUtils.copyInputStreamToFile(file.getInputStream(),
          new File(path, file.getOriginalFilename()));
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/upload1")
    public @ResponseBody
    SubmitResultInfo upload1(@RequestParam("file") MultipartFile file) throws Exception {
        String path = "C:\\Users\\MIO\\Desktop\\DownloaderServer";
        FileUtils.copyInputStreamToFile(file.getInputStream(),
                new File(path, file.getOriginalFilename()));
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/upload2")
    public @ResponseBody
    SubmitResultInfo upload2(

            @RequestParam(value = "file", required = false) CommonsMultipartFile file[],
            HttpSession session
            ) throws Exception {

        System.out.println(file.length);

        for(int i = 0;i<file.length;i++){
            if (!file[i].isEmpty()) {
                String path = "C:\\Users\\MIO\\Desktop\\DownloaderServer";
                FileUtils.copyInputStreamToFile(file[i].getInputStream(),
                        new File(path, file[i].getOriginalFilename()));
            }
        }

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

}
