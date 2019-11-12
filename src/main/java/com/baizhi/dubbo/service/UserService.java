package com.baizhi.dubbo.service;

import com.baizhi.dubbo.pojo.UserAddress;

import java.util.List;

/**
 * 用户
 */
public interface UserService {
    /**
     * 按照用户ip返回相应的用户地址
     */
    public List<UserAddress> getUserAddressList(String userId);

}
