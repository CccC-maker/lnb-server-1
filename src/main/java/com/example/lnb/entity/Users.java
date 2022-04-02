package com.example.lnb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor  //全参构造
@NoArgsConstructor  //无参构造
@Data //自动生成get和set方法
@TableName("Users")  //指定数据库中的表
public class Users {

    private String username;

    private String password;

}
