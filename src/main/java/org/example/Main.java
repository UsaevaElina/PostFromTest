package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Элина";
        post.passport = "1567№56789890";
        post.patronymic = "Усаева";
        post.phone = "+7(999)678-50-91";
        post.surname = "Усаева";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 11;
        post.birthday.year = 1997;
    }
}