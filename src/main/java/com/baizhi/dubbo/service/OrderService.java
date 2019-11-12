package com.baizhi.dubbo.service;

import com.baizhi.dubbo.pojo.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     */
    public List<UserAddress> initOrder(String userId);

}
