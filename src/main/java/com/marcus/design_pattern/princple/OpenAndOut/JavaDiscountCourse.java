package com.marcus.design_pattern.princple.OpenAndOut;

/**
 * @description: 添加课程打折的信息，遵循开闭原则(开放添加，关闭修改)，
 * 不在原有类中添加属性，而是拓展一个子类
 * @author: marcus
 * @date: 2018/10/25
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Long id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOrignPrice(){
        return super.getPrice();
    }

    /**以打八折为例 */
    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }
}
