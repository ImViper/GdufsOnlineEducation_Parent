package com.grain.teacher.entity.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2020/11/2 14:16
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class OneSubject {

    private String id;

    private String title;

    private List<TwoSubject> children = new ArrayList<TwoSubject>();

}
