package br.com.ryanmenezes.picpaydesafiobackend.transaction;

public class UnauthorizedTransactionException extends RuntimeException {
    public UnauthorizedTransactionException(String message) {
        super(message);
    }
}
