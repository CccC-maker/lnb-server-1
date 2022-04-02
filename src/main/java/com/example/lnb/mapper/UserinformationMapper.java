package com.example.lnb.mapper;

import com.example.lnb.entity.Userinformation;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserinformationMapper {
    /**
     * 展示个人信息
     * @param userinformation
     * @return
     */
    @Select("SELECT uage,usex,uaddress,uphone FROM Userinformation where uusername=#{uusername}")
    Userinformation display(Userinformation userinformation);

    /**
     * 添加个人信息
     * @param userinformation
     * @return
     */
    @Insert("INSERT INTO Userinformation(uage,usex,uaddress,uphone) VALUES (#{uage},#{usex}),#{uaddress},#{uphone} ")
    Userinformation insert(Userinformation userinformation);
    /**
     * 修改个人信息
     * @param userinformation
     * @return
     */
    @Update("UPDATE Userinformation SET uage=#{uage},usex=#{usex},uaddress=#{uaddress},uphone=#{uphone} WHERE uusername=#{uusername}")
    Userinformation update(Userinformation userinformation);
}
