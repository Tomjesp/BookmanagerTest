package com.xyq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/28 9:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wish {

    private int id;

    private int user_id;
    private String nickName;
    private String tel;

    private String title;
    private String desc;

    private int state;
    private String sName;
}
