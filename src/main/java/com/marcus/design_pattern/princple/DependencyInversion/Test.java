package com.marcus.design_pattern.princple.DependencyInversion;

public class Test {

    public static void main(String[] args) {
        Tom tom = new Tom();
//        tom.studyFECourse();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();

        /**依赖倒置可以松耦合，高层不再依赖于低层，
         * 课程的选择权交给了应用层
         * */
        tom.studyCourse(new JavaCourse());
        tom.studyCourse(new FECourse());

        /**构造器注入 测试
         * 缺陷是只有在构造对象的时候才能注入
         * */
        Tom tom1 = new Tom(new PythonCourse());
        tom1.studyCourse2();

        /**setter注入 测试
         * 和构造器注入相比，更加灵活
         * */
        Tom tom2 = new Tom();
        tom2.setStudyCourse(new FECourse());
        tom2.studyCourse2();
    }
}
