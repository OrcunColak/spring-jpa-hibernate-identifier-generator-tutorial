package com.colak.springtutorial.customidgenerator;

import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

// @IdGeneratorType( CustomIdGenerator.class)
@IdGeneratorType( CustomIdGeneratorFromSequence.class)
@Retention( RetentionPolicy.RUNTIME)
@Target({ FIELD, METHOD})
public @interface UsrId {

}
