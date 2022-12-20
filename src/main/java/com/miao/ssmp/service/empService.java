package com.miao.ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.miao.ssmp.domain.emp;

import java.util.List;

/**
 * @author miaotongli
 * @create 2022-10-29-下午 09:48
 * @describe
 */
public interface empService {
    boolean save(emp e);
    boolean delete(Integer id);
    boolean update(emp e);
    emp getById(Integer id);
    List<emp> getEmpAll();
    IPage<emp> getByPage(int cuurentPage,int pageSize);

}
