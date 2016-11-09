package com.companyname.framework.db;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Druid连接池配置类
 * 一般不需要修改
 */
@Data
@Configuration
public class DruidJdbcConfiguration extends JdbcConfiguration {

    @Value(value = "${druid.jdbc.filters}")
    private String filters;
    @Value(value = "${druid.jdbc.maxWait}")
    private Integer maxWait;
    @Value(value = "${druid.jdbc.poolPreparedStatements}")
    private Boolean poolPreparedStatements;
    @Value(value = "${druid.jdbc.maxOpenPreparedStatements}")
    private Integer maxOpenPreparedStatements;
}
