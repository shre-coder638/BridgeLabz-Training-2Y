package com.BankingTransactionSystem;

public class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}