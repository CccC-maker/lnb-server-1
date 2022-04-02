package com.example.lnb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("Activities")
public class Activities {

    private Integer AID;
    private Date activitytime;
    private String activityaddress;
    private String activitydescription;
}
