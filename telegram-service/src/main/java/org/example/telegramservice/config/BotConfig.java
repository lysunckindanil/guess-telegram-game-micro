package org.example.telegramservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:token.properties")
public class BotConfig {
    @Value("${bot.token}")
    String token;
}
