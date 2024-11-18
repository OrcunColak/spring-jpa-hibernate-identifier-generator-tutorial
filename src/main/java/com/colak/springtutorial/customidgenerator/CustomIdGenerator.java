package com.colak.springtutorial.customidgenerator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

    private static long counter = 1;

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object ) {
        String prefix = "USR";
        String suffix = String.format("%05d", counter++);
        return prefix + suffix;
    }

}