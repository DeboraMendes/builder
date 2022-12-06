package com.designPattern.creational.builder.email;

import lombok.Getter;
import lombok.Setter;

/**
 * Representa um email
 */
@Setter
@Getter
public class Email {

    private String from;
    private String to;
    private String title;
    private String content;
    private String signature;

}
