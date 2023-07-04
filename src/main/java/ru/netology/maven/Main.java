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

        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 10;
        post.birthday.year = 1977;
    }
}