package com.tql.test3;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Student() {
    }

    public Student(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "sum= "+sum()+"}";
    }

    @Override
    /* 按照总分从高到低输出到控制台
    如果总分一样，按照语文成绩排
    如果语文一样，按照数学成绩排
    如果数学成绩一样，按照英语成绩排
    如果英文成绩一样，按照年龄排
    如果年龄一样，按照姓名的字母顺序排
    如果都一样，认为是同一个学生，不存。*/
    public int compareTo(Student o) {
        double sum = this.sum()-o.sum();
        if (sum  > 0 ) return 1;
        else if (sum < 0) return -1;
        else {
            if(this.getChinese() - o.getChinese() > 0) return 1;
            else if(this.getChinese() - o.getChinese() < 0) return -1;
            else {
                if(this.getMath() - o.getMath() > 0) return 1;
                else if(this.getMath() - o.getMath() < 0) return -1;
                else {
                    if(this.getEnglish() - o.getEnglish() > 0) return 1;
                    else if(this.getEnglish() - o.getEnglish() < 0) return -1;
                    else {
                        if(this.getAge() - o.getAge() == 0){
                            return this.getName().compareTo(o.getName());
                        }
                        return this.getAge() - o.getAge();
                    }
                }
            }
        }
    }

    public double sum(){
        return math+english+chinese;
    }
}
