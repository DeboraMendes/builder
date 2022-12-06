package com.designPattern.creational.builder;

import com.designPattern.creational.builder.email.Email;
import com.designPattern.creational.builder.email.EmailBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * O Builder, também conhecido como Construtor,
 * é um padrão de projeto criacional que permite
 * construir objetos complexos passo a passo.
 * O padrão possibilita construir diferentes tipos e representações de um objeto usando o mesmo código de construção.
 */
@RunWith(MockitoJUnitRunner.class)
public class BuilderTest {

    @InjectMocks
    private EmailBuilder emailBuilder;

    private Email email1;

    private Email email2;

    @Before
    public void init() {
        email1 = emailBuilder
                .builder()
                .from("from1@email.com")
                .to("to1@email.com")
                .title("Builder 1")
                .content("Exemple 1")
                .signature("Debora Mendes")
                .build();
        email2 = emailBuilder
                .builder()
                .from("from2@email.com")
                .to("to2@email.com")
                .title("Builder 2")
                .content("Exemple 2")
                .signature("Debora Mendes")
                .build();
    }

    /**
     * Deve testar se as instâncias diferem e se cada uma delas possui o conteúdo especificado.
     */
    @Test
    public void test() {
        Assert.assertNotEquals(email1, email2);

        Assert.assertEquals("from1@email.com", email1.getFrom());
        Assert.assertEquals("to1@email.com", email1.getTo());
        Assert.assertEquals("Builder 1", email1.getTitle());
        Assert.assertEquals("Exemple 1", email1.getContent());
        Assert.assertEquals("Debora Mendes", email1.getSignature());

        Assert.assertEquals("from2@email.com", email2.getFrom());
        Assert.assertEquals("to2@email.com", email2.getTo());
        Assert.assertEquals("Builder 2", email2.getTitle());
        Assert.assertEquals("Exemple 2", email2.getContent());
        Assert.assertEquals("Debora Mendes", email2.getSignature());
    }

}