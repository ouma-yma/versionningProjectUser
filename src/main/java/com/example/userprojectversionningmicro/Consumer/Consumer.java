package com.example.userprojectversionningmicro.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
    @Bean
    public java.util.function.Consumer<String> onReceive(){
        return (message)->{
            log.info("Reception du message {} du consummation ", message);
        };
    }
}
