package org.example.controller;

import org.example.entity.UserInfo;
import org.example.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService ;

    //localhost:7010/saveData
    @GetMapping("/saveData")
    public String saveData (){
        UserInfo userInfo = new UserInfo() ;
        userInfo.setId(4);
        userInfo.setUserName("xiaolin");
        userInfo.setPassWord("54321");
        userInfo.setPhone("18500909876");
        userInfo.setCreateDay("2022-02-06");
        userInfoService.saveData(userInfo);
        return "success";
    }

    //localhost:7010/getById?id=1
    @GetMapping("/getById")
    public UserInfo getById (int id) {
        return userInfoService.selectById(id) ;
    }

    @GetMapping("/getList")
    public List<UserInfo> getList () {
        return userInfoService.selectList() ;
    }

}


