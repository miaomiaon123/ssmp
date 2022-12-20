package com.miao.ssmp.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miao.ssmp.dao.tempDao;
import com.miao.ssmp.domain.emp;
import com.miao.ssmp.service.empServiceMp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * @author miaotongli
 * @create 2022-10-30-上午 11:34
 * @describe
 */
@Service
public class empServiceMpImpl extends ServiceImpl<tempDao, emp> implements empServiceMp {
    @Autowired
    private tempDao tem;

    @Override
    public Boolean delete(Integer id) {
        return tem.deleteById(id)>0;
    }

    @Override
    public Boolean insert(emp e) {
        return null;
    }

    @Override
    public Boolean modify(emp e) {
      return tem.update(e,null)>0;
    }

    @Override
    public Book get(Integer id) {
        return null;
    }

    @Override
    public IPage<emp> getPage(Integer currentPage, Integer pageSize) {
        Page<emp> empPage = new Page<>(currentPage, pageSize);
        Page<emp> empPage1 = tem.selectPage(empPage, null);
        return empPage1;
    }
}
