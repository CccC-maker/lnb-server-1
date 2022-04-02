package com.example.lnb.service;

import com.example.lnb.entity.Userinformation;
import com.example.lnb.entity.dto.Display_Insert_Update_DTO;
import com.example.lnb.mapper.UserinformationMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserinformationService {
    @Autowired
    private UserinformationMapper userinformationMapper;
    /**
     * 展示个人信息
     * @param userinformation
     * @return
     */
    public Display_Insert_Update_DTO display(Userinformation userinformation){
        Display_Insert_Update_DTO result = new Display_Insert_Update_DTO();
        try{
            Userinformation userinformation1 = userinformationMapper.display(userinformation);
            if(userinformation1!=null){
                result.setMsg("true");
                result.setUage(userinformation.getUage());
                result.setUaddress(userinformation.getUaddress());
                result.setUsex(userinformation.getUsex());
                result.setUphone(userinformation.getUphone());
            }else{
                result.setMsg("false");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setMsg("error");
        }
        return result;
    }
}
