package com.example.shopping;

import java.util.HashMap;
import java.util.Map;

public class PayFactory {

    private final Map<PayType, Pay> payMethods = new HashMap<>();

    public PayFactory() {
        // 초기화 시점에 PayType에 따른 결제 방식을 등록
        payMethods.put(PayType.MOBILE, new MobilePayment());
        payMethods.put(PayType.CARD, new CardPayment());
        payMethods.put(PayType.BANK_TRANSFER, new BankPayment());
    }

    public Pay getPayMethod(PayType payType) {
        Pay pay = payMethods.getOrDefault(payType, null);
        if (pay == null) {
            throw new IllegalArgumentException("Not Supported payType : " + payType);
        }
        return pay;
    }
}
