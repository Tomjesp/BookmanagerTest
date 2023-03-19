package com.xyq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/27 9:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Major {

    private int id;
    private String name;

    private int departId;
    private String departName;

    public Major(String name, int departId) {
        this.name = name;
        this.departId = departId;
    }
}
