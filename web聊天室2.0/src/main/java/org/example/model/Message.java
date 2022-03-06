package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



// 自动生成 get 等方法
@Getter
@Setter
@ToString
public class Message {

    private Integer messageId;
    private Integer userId;
    private Integer channelId;
    private String content;
    private java.util.Date sendTime;

    private String nickName;

}
