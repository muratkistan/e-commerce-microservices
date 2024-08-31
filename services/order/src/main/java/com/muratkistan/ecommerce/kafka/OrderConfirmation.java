package com.muratkistan.ecommerce.kafka;

import com.muratkistan.ecommerce.customer.CustomerResponse;
import com.muratkistan.ecommerce.order.PaymentMethod;
import com.muratkistan.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}