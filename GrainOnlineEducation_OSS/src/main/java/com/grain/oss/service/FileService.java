package com.grain.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @description：
 * @modified By：
 * @version: $
 */
public interface FileService {

    /**
     * 文件上传至阿里云
     * @param file
     * @return
     */
    String upload(MultipartFile file);

}
