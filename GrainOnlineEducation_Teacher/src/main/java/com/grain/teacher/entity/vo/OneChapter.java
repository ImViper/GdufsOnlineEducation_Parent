package com.grain.teacher.entity.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2020/11/6 9:41
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class OneChapter {

    private String id;

    private String title;

    private List<TwoVideo> children = new ArrayList<>();

}
