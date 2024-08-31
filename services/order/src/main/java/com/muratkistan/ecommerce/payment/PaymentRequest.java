package com.muratkistan.ecommerce.payment;

import com.muratkistan.ecommerce.customer.CustomerResponse;
import com.muratkistan.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}