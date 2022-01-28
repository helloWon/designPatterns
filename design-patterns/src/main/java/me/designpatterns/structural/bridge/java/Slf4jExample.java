package me.designpatterns.structural.bridge.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 로깅 퍼사드를 통해서 사용하고 있다. 
 */
public class Slf4jExample {

    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
