package com.lomasz.springbootelk;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CommonsLog
public class LoggingController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/api/log")
    void log(){
        log.error("This is error");
        log.warn("This is warning");
        log.info("This is info");
        log.debug("This is debug");
        log.trace("This is trace");
    }
}

