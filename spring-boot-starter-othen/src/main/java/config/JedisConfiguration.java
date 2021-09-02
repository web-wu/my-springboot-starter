package config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(JedisProperties.class)
public class JedisConfiguration {


    @Bean
    public Jedis wuJedis(JedisProperties jedisConf) {
        return new Jedis(jedisConf.getHost(),jedisConf.getPort());
    }
}
