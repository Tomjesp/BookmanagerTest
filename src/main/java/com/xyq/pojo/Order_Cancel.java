package com.xyq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/27 9:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order_Cancel {

    private int id;

    private int book_id;
    private String name;
    private String publisher;
    private String code;
    private String author;
    private double price;
    private int newDeg;


    private int order_id;
    private int id_buy;
    private String nickname;
    private String tel;
    private String address;

    private String reason;
    private int state;

}
