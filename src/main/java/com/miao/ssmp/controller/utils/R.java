package com.miao.ssmp.controller.utils;

import lombok.Data;

/**
 * @author miaotongli
 * @create 2022-10-30-下午 03:36
 * @describe
 */
@Data
public class R {
    private boolean flag;
    private Object data;
    private String msg;

    public R() {
    }

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    public R(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
