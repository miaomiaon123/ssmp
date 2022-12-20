package com.miao.ssmp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author miaotongli
 * @create 2022-10-28-下午 05:22
 * @describe
 */
@Data
public class emp {
    @TableId("emp_id")
    private Integer empId;
    private String empName;
    private int age;
    private String sex;
    private String email;
}
