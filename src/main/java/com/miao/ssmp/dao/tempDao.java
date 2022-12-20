package com.miao.ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miao.ssmp.domain.emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author miaotongli
 * @create 2022-10-28-下午 05:28
 * @describe
 */

@Repository
@Mapper
public interface tempDao  extends BaseMapper<emp> {
    @Select("select * from t_emp where emp_id=1")
    emp selecy();
}
