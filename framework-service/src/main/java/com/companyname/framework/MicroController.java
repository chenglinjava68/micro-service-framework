package com.companyname.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller基础类
 */
public abstract class MicroController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
}
