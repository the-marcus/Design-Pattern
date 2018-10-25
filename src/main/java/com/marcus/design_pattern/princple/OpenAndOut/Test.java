package com.marcus.design_pattern.princple.OpenAndOut;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
//        JavaCourse javaCourse = new JavaCourse(888L,"JavaCourse",99d);
        ICourse javaCourse = new JavaDiscountCourse(888L,"JavaCourse",99d);
        log.info("{}",javaCourse.getPrice());
        log.info("课程id:{},课程名称：{},课程价格：{}",javaCourse.getId(),javaCourse.getName(),javaCourse.getPrice());
    }
}
