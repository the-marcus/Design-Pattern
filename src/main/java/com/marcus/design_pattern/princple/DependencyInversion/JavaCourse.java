package com.marcus.design_pattern.princple.DependencyInversion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaCourse implements IStudyCourse{

    @Override
    public void studyCourse() {
        log.info("Tom is learning java course");
    }
}
