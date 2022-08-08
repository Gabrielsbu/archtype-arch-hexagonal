package com.example.demo.application.ports.out;

public interface LogPort {

    void info(String message, Object... params);

    void error(String message, Object... params);

    void debug(String message, Object... params);

    void warn(String message, Object... params);
}
