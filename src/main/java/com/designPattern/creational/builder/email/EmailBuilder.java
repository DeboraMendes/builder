package com.designPattern.creational.builder.email;

/**
 * Responsável pela criação do email.
 * É retornado "this" para possibilitar o encadeamento de métodos.
 */
public class EmailBuilder {

    private Email email;

    public EmailBuilder builder() {
        email = new Email();
        return this;
    }

    public EmailBuilder from(String from) {
        email.setFrom(from);
        return this;

    }

    public EmailBuilder to(String to) {
        email.setTo(to);
        return this;
    }

    public EmailBuilder title(String title) {
        email.setTitle(title);
        return this;
    }

    public EmailBuilder content(String content) {
        email.setContent(content);
        return this;
    }

    public EmailBuilder signature(String signature) {
        email.setSignature(signature);
        return this;
    }

    public Email build() {
        return email;
    }

}
