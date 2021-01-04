package ru.arsenev.restaurant.exception;

public class UnauthorizedException extends RuntimeException{
    private String errorMessage;

    public UnauthorizedException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
