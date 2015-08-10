package com.ivm.bupazu.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;    
import javax.servlet.http.HttpServletRequest;  
import java.io.File;  
import java.io.FileOutputStream;
import java.io.IOException;  

public class FileUpload {  
	  
	 @Value(value = "${YongHuTuXiang}") 
	 private  String YongHuTuXiang;  
	      
	    public void setPicUrl(String YongHuTuXiang) {  
	        this.YongHuTuXiang = YongHuTuXiang;  
	    }  
	
	private void saveFile(String newFileName, MultipartFile filedata) throws IOException {
        // TODO Auto-generated method stub
        // 根据配置文件获取服务器图片存放路径
    	
//    	
//    	String picDir = "";
//        //这里封装了读取配置文件的方法 配置文件中有图片的存放地址和获取地址
//        PropertiesUtile util= new PropertiesUtile("pictrueUpload.properties");
//        util.printProperties() ;
//        picDir = util.getProperty("YongHuTuXiang");
       String saveFilePath = YongHuTuXiang; 
        /* 构建文件目录 */
        File fileDir = new File(saveFilePath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
 
        try {
            FileOutputStream out = new FileOutputStream(saveFilePath + "\\"
                    + newFileName);
            // 写入文件
            out.write(filedata.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}  
