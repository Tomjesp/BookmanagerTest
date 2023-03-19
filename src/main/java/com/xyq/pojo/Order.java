package com.xyq.pojo;

import com.xyq.service.impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/27 9:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {


    private int id;

    private int id_buy; //购买人id
    private String nickname;
    private String tel;
    private String address;

    private int book_id;    //购买书id
    private String name;
    private String publisher;
    private String code;
    private String author;
    private double price;
    private int newDeg;

    private int uId;    //本书所有人id
    private String uName;
    private String uTel;
    private String uAddress;

    private Date time;
    private int state;
    private String sname;

}
