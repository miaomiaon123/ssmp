package com.miao.ssmp.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miao.ssmp.dao.tempDao;
import com.miao.ssmp.domain.emp;
import com.miao.ssmp.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author miaotongli
 * @create 2022-10-29-下午 09:50
 * @describe
 */
@Service
public class empServiceImpl implements empService {
    @Autowired
    private tempDao dao;
    @Override
    public boolean save(emp e) {
        return dao.insert(e)>0;

    }

    @Override
    public boolean delete(Integer id) {
     return    dao.deleteById(id)>0;

    }

    @Override
    public boolean update(emp e) {
       return dao.updateById(e)>0;
    }

    @Override
    public emp getById(Integer id) {
        return dao.selectById(id);
    }

    @Override
    public List<emp> getEmpAll() {
        return dao.selectList(null);
    }

    @Override
    public IPage<emp> getByPage(int cuurentPage, int pageSize) {

        Page<emp> empPage = new Page<>(cuurentPage, pageSize);
        return dao.selectPage(empPage,null);
    }
}
