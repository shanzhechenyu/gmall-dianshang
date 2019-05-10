package com.atguigu.gmall.ums.config;


import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 这是一个配置类
 *
 * SpringBoot引入某个场景，这个场景的组件就会自动配置好。
 * 1）、
 */
@Configuration
public class UmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {

        //使用sharding-jdbc创建出具有主从库的数据源
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }
}
