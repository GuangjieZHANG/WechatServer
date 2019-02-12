package fr.toulouse.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
//配置mapper扫描路径
@MapperScan("fr.toulouse.dao")
public class DatasourceConfiguration {

    @Value("${jdbc.diver}")
    private String jdbcDiver;
    @Value("${jdbc.url}")
    private String jdbcURL;
    @Value("${jdbc.username}")
    private String jdbcUserName;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDiver);
        dataSource.setJdbcUrl(jdbcURL);
        dataSource.setUser(jdbcUserName);
        dataSource.setPassword(jdbcPassword);
        // 关闭连接后不自动提交
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }

}
