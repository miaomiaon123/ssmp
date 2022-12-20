package com.miao.ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.miao.ssmp.controller.utils.R;
import com.miao.ssmp.domain.emp;
import com.miao.ssmp.service.empServiceMp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author miaotongli
 * @create 2022-10-30-下午 03:37
 * @describe
 */
@Slf4j
@RestController
@RequestMapping("/empR")
public class empControllerR {
    @Autowired
    private empServiceMp empS;

    @GetMapping
    public R getList() {
        System.out.println("66666666666666666");
        log.info("info......");
        return new R(true,empS.list());
    }
    @PostMapping
    public R save(@RequestBody emp e) {
        System.out.println(e);
        boolean flag = empS.save(e);
        return new R(flag,flag?"添加成功":"添加失败");
    }

    @PutMapping
    public R update(@RequestBody emp e) {
        return new R(empS.modify(e));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(empS.removeById(id));
    }

    @GetMapping("{id}")
    public R getEmpById(@PathVariable Integer id) {
        return new R(true,empS.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        return new R(true,empS.getPage(currentPage,pageSize));
    }
}

