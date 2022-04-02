package com.example.lnb.service;

import com.example.lnb.entity.Users;
import com.example.lnb.entity.dto.Login_Register_DTO;
import com.example.lnb.mapper.LoginRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  //注入到springboot容器中
public class LoginRegisterrService {

    @Autowired
    private LoginRegisterMapper userMapper;

    /**
     * 注册
     * @param users
     * @return
     */
    public Login_Register_DTO register(Users users) {
        Login_Register_DTO result=new Login_Register_DTO();
        result.setJudgeinfo(false);
        try {
            Users userByName = userMapper.findUsers(users.getUsername());
            if(userByName!=null) {
                //如果查询到 说明存在
                result.setMsg("用户名已存在");
            } else {
                userMapper.register(users);
                result.setMsg("注册成功");
                result.setJudgeinfo(true);
            }
        } catch(Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 登录
     * @param users
     * @return
     */
    public Login_Register_DTO login(Users users){
        Login_Register_DTO result=new Login_Register_DTO();
        result.setJudgeinfo(false);
        try {
            Users userTemp = userMapper.login(users);
            if(userTemp==null){
                result.setMsg("用户名或密码错误");
            }else {
                result.setMsg("登录成功");
                result.setJudgeinfo(true);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
