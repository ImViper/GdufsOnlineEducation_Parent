package com.grain.vod.service;

import com.aliyuncs.exceptions.ClientException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2020/11/7 17:37
 * @description：
 * @modified By：
 * @version: $
 */
public interface VodService {

    /**
     *
     * @param file
     * @return
     */
    String uploadVideo(MultipartFile file);

    /**
     * 根据视频ID删除视频
     * @param videoSourceId
     * @return
     */
    Boolean deleteVodById(String videoSourceId);

    /**
     * 批量删除云端视频
     * @param videoIdList
     * @return
     */
    Boolean removeVideoList(List videoIdList);

    /**
     * 获取播放凭证
     * @param videoId
     * @return
     */
    String getVideoPlayAuth(String videoId) throws ClientException;
}
