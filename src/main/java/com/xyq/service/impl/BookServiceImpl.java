package com.xyq.service.impl;

import com.xyq.dao.BookMapper;
import com.xyq.pojo.Book;
import com.xyq.service.inte.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getBooks() {
        return bookMapper.getBooks();
    }

    @Override
    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> accuracyFindBook(String bookName, Integer state) {
        return bookMapper.selectAccuracyBook(bookName, state);
    }

    @Override
    public List<Book> likeFindBook(String bookName, Integer state) {
        return bookMapper.likeSelectBook(bookName, state);
    }


}
