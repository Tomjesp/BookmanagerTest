package com.xyq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 朱文杰
 * @create 2022/7/16 22:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String nickname;
    private String password;
    private String tel;
    private Date registerTime;

    private int departId;
    private String departName;

    private int majorId;
    private String majorName;

    private int grade;
    private String address;
    private String name;

}
