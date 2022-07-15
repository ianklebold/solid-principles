package com.principies;

public interface Payment {
    public void calculatePayment();
    public void creditCardPayment();
    public void bankTransferPayment();
    public void cashPayment();
}
