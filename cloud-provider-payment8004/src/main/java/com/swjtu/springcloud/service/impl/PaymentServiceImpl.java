package com.swjtu.springcloud.service.impl;

import com.swjtu.springcloud.dao.PaymentDao;
import com.swjtu.springcloud.entities.Payment;
import com.swjtu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Lil_boat
 * @Date: 2022/7/30 14:16
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
