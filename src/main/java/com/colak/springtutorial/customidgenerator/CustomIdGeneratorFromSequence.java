package com.colak.springtutorial.customidgenerator;

import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.hibernate.type.descriptor.java.spi.JavaTypeBasicAdaptor;
import org.hibernate.type.descriptor.jdbc.NumericJdbcType;
import org.hibernate.type.internal.NamedBasicTypeImpl;

import java.util.Properties;

public class CustomIdGeneratorFromSequence extends SequenceStyleGenerator {


    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        Object sequenceValue = super.generate(session, object);
        if (!(sequenceValue instanceof Number)) {
            throw new IllegalArgumentException("Expected a numeric sequence value");
        }

        return "USR" + String.format("%05d", ((Number) sequenceValue).longValue());
    }

    @Override
    public void configure(Type type, Properties parameters, ServiceRegistry serviceRegistry) throws MappingException {
        parameters.put("increment_size", 1);
        Type idType = new NamedBasicTypeImpl<>(new JavaTypeBasicAdaptor<>(Long.class), NumericJdbcType.INSTANCE, "long");
        super.configure(idType, parameters, serviceRegistry);
    }

}
