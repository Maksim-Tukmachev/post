package ru.netology.maven;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ame";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        FormDate birthDate = new FormDate();
        birthDate.day = 12;
        birthDate.month = 10;
        birthDate.year = 1977;
    }
}