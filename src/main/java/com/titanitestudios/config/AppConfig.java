package com.titanitestudios.config;

import com.titanitestudios.transaction.SankarBo;
import com.titanitestudios.transaction.TransactionBo;
import com.titanitestudios.transaction.impl.SankarBoImpl;
import com.titanitestudios.transaction.impl.TransactionBoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="transactionBo")
    public TransactionBo save() {
        return new TransactionBoImpl();
    }

    @Bean(name="SankarBo")
    public SankarBo helloWorld() {
        return new SankarBoImpl();
    }

}