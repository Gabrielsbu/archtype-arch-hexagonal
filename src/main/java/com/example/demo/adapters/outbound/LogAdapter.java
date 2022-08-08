package com.example.demo.adapters.outbound;

import com.example.demo.application.ports.out.LogPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogAdapter implements LogPort {

    @Override
    public void info(String message, Object... params) {
        log.info(message, params);
    }

    @Override
    public void error(String message, Object... params) {
        log.error(message, params);
    }

    @Override
    public void debug(String message, Object... params) {
        log.debug(message, params);
    }

    @Override
    public void warn(String message, Object... params) {
        log.warn(message, params);
    }
}
