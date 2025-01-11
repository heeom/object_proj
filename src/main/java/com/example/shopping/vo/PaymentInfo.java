package com.example.shopping.vo;

import java.math.BigDecimal;

public abstract class PaymentInfo { // PaymentInfo 자체는 인스턴스 생성 못하게 abstract 클래스로 선언
    private BigDecimal amount;

    protected PaymentInfo(BigDecimal amount) {
        this.amount = amount;
    }

    class CardPaymentInfo extends PaymentInfo {
        private String cardCompany;
        private String cardNumber;

        public CardPaymentInfo(final BigDecimal amount, final String cardCompany, final String cardNumber) {
            super(amount);
            this.cardCompany = cardCompany;
            this.cardNumber = cardNumber;
        }
    }

    class BankPaymentInfo extends PaymentInfo {
        private String bank;
        private String accountNumber;

        public BankPaymentInfo(final BigDecimal amount, final String bank, final String accountNumber) {
            super(amount);
            this.bank = bank;
            this.accountNumber = accountNumber;
        }
    }

    class MobilePaymentInfo extends PaymentInfo {
        private String telecoms;
        private String phoneNumber;

        public MobilePaymentInfo(final BigDecimal amount, final String telecoms, final String phoneNumber) {
            super(amount);
            this.telecoms = telecoms;
            this.phoneNumber = phoneNumber;
        }
    }
}
