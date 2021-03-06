package com.ontheroad.pojo.Information;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

public class Slideshow implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter @Setter private int id;
    @Getter @Setter private boolean show;
    @Getter @Setter private int order;
    @Getter @Setter private String title;  //标题
    @Getter @Setter private Date createTime;  //时间
    @Getter @Setter private String content;  //内容
    @Getter @Setter private String summary;  //概述
    @Getter @Setter private String picture;  //图片
    @Getter @Setter private String address;   //地
}
