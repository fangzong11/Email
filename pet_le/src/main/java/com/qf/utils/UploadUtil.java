package com.qf.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadUtil {

    public static String uploadFile(MultipartFile file,String dir) throws IOException {
        String oldFileName = file.getOriginalFilename();
        String extName = oldFileName.substring(oldFileName.lastIndexOf("."));
        String newFileName = System.currentTimeMillis() + extName;
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File(dir,newFileName));
        return newFileName;
    }
}
