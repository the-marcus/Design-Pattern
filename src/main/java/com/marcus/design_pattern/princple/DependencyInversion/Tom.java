package com.marcus.design_pattern.princple.DependencyInversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 依赖倒置原则
 * @author: marcus
 * @date: 2018/10/25
 */
@Slf4j
public class Tom {

    /**Tom是低层模块，Test是应用层，属于高层模块
     * 根据依赖倒置原则，高层模块不应该依赖于低层模块。
     * 而且Tom类中的方法扩展性很差
     *
     * Spring从低层到高层：
     * DAO->SERVICE->CONTROLLER
     * */

//    public void studyJavaCourse(){
//        log.info("Tom is learning java course");
//    }
//
//    public void studyPythonCourse(){
//        log.info("Tom is learning python course");
//    }
//    public void studyFECourse(){
//        log.info("Tom is learning front-end course");
//    }

    public Tom(){}

    /**通过接口方法注入 */
    public void studyCourse(IStudyCourse studyCourse){
        studyCourse.studyCourse();
    }


    /**==============================================================
     * 通过构造方法注入
     * */

    private IStudyCourse studyCourse;

    public Tom(IStudyCourse studyCourse) {
        this.studyCourse = studyCourse;
    }

    public void studyCourse2(){
        this.studyCourse.studyCourse();
    }

    /**==============================================================
     * 通过setter方法注入
     * */
    public void setStudyCourse(IStudyCourse studyCourse) {
        this.studyCourse = studyCourse;
    }


}
