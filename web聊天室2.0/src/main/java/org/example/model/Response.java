package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Response {
    // 当前接口响应的是否操作成功
    private boolean ok;
    // 操作时报，前端展示错误信息
    private String reason;
    // 保存业务数据
    private Object data;
}
