package com.miao.ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.miao.ssmp.domain.emp;

import java.awt.print.Book;

/**
 * @author miaotongli
 * @create 2022-10-30-上午 11:34
 * @describe
 */
public interface empServiceMp extends IService<emp> {
    //追加的操作与原始操作通过名称区分，功能类似
    Boolean delete(Integer id);
    Boolean insert(emp e);
    Boolean modify(emp e);
    Book get(Integer id);
    IPage<emp> getPage(Integer currentPage,Integer pageSize);
}
