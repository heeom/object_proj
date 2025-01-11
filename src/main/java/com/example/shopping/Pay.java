package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;


public interface Pay {

    /**
     * 총 결제 금액과 결제 유형에 따라 필요한 정보를 입력받아서 결제한다
     * @param paymentInfo 결제시 필요한 정보
     */
    void makePayment(PaymentInfo paymentInfo);
}
