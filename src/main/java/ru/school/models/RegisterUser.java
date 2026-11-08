package ru.school.models;

public record RegisterUser (
    String email,
    String password,
    String confirmPassword
) {
}
