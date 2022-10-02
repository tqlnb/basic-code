package com.tql.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final  String ADD_USER = "1";
    private static final  String DELETE_STUDENT = "2";
    private static final  String UPDATE_STUDENT = "3";
    private static final  String QUERY_STUDENT = "4";
    private static final  String EXIT = "5";
    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();
        loginSystem();
        looper : while(true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case ADD_USER -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    break looper;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Student s = new Student();
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            if (contains(list, id)) {
                System.out.println("id存在，请重新输入");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名");
        s.setName(sc.next());
        System.out.println("请输入学生年龄");
        s.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址");
        s.setAddress(sc.next());
        list.add(s);
        System.out.println("添加成功");
    }


    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String id =sc.next();
        if(contains(list,id)){
            Student remove = list.remove(getIndex(list, id));
            System.out.println("删除成功，删除的是ID为"+remove.getId()+"的学生");
        }else{
            System.out.println("id不存在，请确认后再删除");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index < 0 ){
            System.out.println("id不存在");
        }else{
            Student s =new Student();
            s.setId(id);
            System.out.println("请输入"+id+"学生的姓名");
            s.setName(sc.next());
            System.out.println("请输入"+id+"的学生的年龄");
            s.setAge(sc.nextInt());
            System.out.println("请输入"+id+"的学生的地址");
            s.setAddress(sc.next());
            list.set(index,s);
            System.out.println("修改成功");
        }
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
        }else {
            System.out.println("id" + '\t' + '\t' + "姓名" + '\t' + "年龄" + '\t' + "家庭住址");
            for (Student student : list) {
                System.out.print(student.getId()  + '\t');
                System.out.print(student.getName() + '\t');
                System.out.print(student.getAge() + "\t"+"\t");
                System.out.println(student.getAddress());
            }
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        for (Student stu : list) {
            if (stu.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //通过id获取索引
    public static int getIndex(ArrayList<Student> list,String id){
        int count = 0;
        for (Student stu : list) {
            if(stu.getId().equals(id)){
                return count;
            }
            count ++;
        }
        return -1;
    }

    //登陆系统
    public static void loginSystem(){
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        looper: while(true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("请选择操作 1.登录 2.注册 3.忘记密码");
            String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    boolean login = login(userList);
                    if(login){
                        System.out.println("登陆成功");
                        break looper;
                    }
                }
                case "2" -> register(userList);
                case "3" -> {
                    boolean forget = forgetPassword(userList);
                    if(forget){
                        System.out.println("密码修改成功");
                    }
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //登录
    //默认验证码为123abc
    public static boolean login(ArrayList<User> userList){
        String verificationCode ="123abc";
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int userIndex = getUserIndex(userList, username);
        if(userIndex == -1){
            System.out.println("用户未注册");
            return false;
        }
        System.out.println("请输入密码");
        String password = sc.next();
        System.out.println("请输入验证码");
        String vCode = sc.next();
        User u = userList.get(userIndex);
        String basicPassword = u.getPassword();
        while(true) {
            if (vCode.equals(verificationCode)) {
                for(int i = 0 ; i < 3 ; i++){
                    if(password.equals(basicPassword)){
                        return true;
                    }else{
                        System.out.println("密码错误，请重新输入密码");
                        password = sc.next();
                    }
                }
                System.out.println("密码错误次数过多,程序退出");
                System.exit(0);
            } else {
                System.out.println("验证码错误，请重新输入验证码");
                vCode = sc.next();
            }
        }
    }

    //注册
    public static void register(ArrayList<User> userList){
        Scanner sc = new Scanner(System.in);
        User u = new User();
        //用户名输入
        while (true) {
            System.out.println("请输入用户名");
            System.out.println("用户名长度必须在3~15位之间\n" +
                    "只能是字母加数字的组合，但是不能是纯数字");
            String username = sc.next();
            int userIndex = getUserIndex(userList, username);
            if (userIndex != -1) {
                System.out.println("用户名不唯一，请重新输入");
            }else{
                boolean usernameCheck = checkUsername(username);
                if(usernameCheck){
                    u.setUsername(username);
                    break;
                }
            }
        }
        //密码输入
        while(true){
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if(password1.equals(password2)){
                u.setPassword(password1);
                break;
            }else{
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
        //身份证号码输入
        while(true) {
            System.out.println("请输入身份证号码");
            String IDcode = sc.next();
            boolean IDcodeCheck = checkIDcode(IDcode);
            if(IDcodeCheck){
                u.setIDcode(IDcode);
                break;
            }else{
                System.out.println("请重新输入");
            }
        }
        //手机号码输入
        while(true) {
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            boolean phoneNumberCheck = checkPhoneNumber(phoneNumber);
            if (phoneNumberCheck) {
                u.setPhoneNumber(phoneNumber);
                break;
            }else{
                System.out.println("请重新输入");
            }
        }
        //输入完成
        userList.add(u);
        System.out.println("注册成功");
    }

    //忘记密码
    //1，键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示:未注册
    //2，键盘录入身份证号码和手机号码
    //3，判断当前用户的身份证号码和手机号码是否一致，
    //如果一致，则提示输入密码，进行修改。
    //如果不一致，则提示:账号信息不匹配，修改失败。
    public static boolean forgetPassword(ArrayList<User> userList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int userIndex = getUserIndex(userList, username);
        if(userIndex == -1){
            System.out.println("用户未注册");
            return false;
        }
        User u = userList.get(userIndex);
        System.out.println("请输入身份证号码");
        String IDcode = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();
        if(u.getIDcode().equals(IDcode) && u.getPhoneNumber().equals(phoneNumber)){
            while(true){
                System.out.println("请输入新的密码");
                String password1 = sc.next();
                System.out.println("请再次输入新的密码");
                String password2 = sc.next();
                if(password1.equals(password2)){
                    u.setPassword(password1);
                    break;
                }else{
                    System.out.println("两次密码输入不一致，请重新输入");
                }
            }
        }else {
            System.out.println("账号信息不匹配，修改失败");
            return false;
        }
        userList.set(userIndex,u);
        return true;
    }

    //获取user索引
    public static int getUserIndex(ArrayList<User> userList,String username){
        int count = 0;
        if(userList.size() == 0){
            return -1;
        }
        for (User user : userList) {
            if(user.getUsername().equals(username)){
                return count;
            }
            count ++;
        }
        return -1;
    }

    //获取username对应的user索引


    //判断username是否合规:
    // 1.用户名长度必须在3~15位之间
    //2.只能是字母加数字的组合，但是不能是纯数字
    public static boolean checkUsername(String username){
        if(username.length() < 3 || username.length() > 15){
            System.out.println("用户名长度错误");
            return false;
        }
        int numberCount = 0, letterCount = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(c >= 65 && c <= 90 || c >=97 && c <= 122){
                letterCount ++;
            } else if (c >= 48 && c <= 57) {
                numberCount ++;
            }else {
                System.out.println("用户名包含非法字符");
                return false;
            }
        }
        if(numberCount == 0){
            System.out.println("密码未包含数字");
            return false;
        }
        if(letterCount == 0){
            System.out.println("密码未包含字母");
            return false;
        }
        return true;
    }

    //判断身份证号码是否合规
    //长度为18位不能以0为开头
    //前17位，必须都是数字
    //最为一位可以是数字，也可以是大写X或小写x
    public static boolean checkIDcode(String IDcode){
        if(IDcode.length() != 18){
            System.out.print("身份证号码长度错误,");
            return false;
        }
        if(IDcode.charAt(0) == '0'){
            System.out.print("身份证号码错误,");
            return false;
        }
        for (int i = 0; i < IDcode.length()-1; i++) {
            if(IDcode.charAt(i) < 48 || IDcode.charAt(i) >57){
                System.out.print("身份证号码错误,");
                return false;
            }
        }
        int index1 = IDcode.length()-1;
        char last = IDcode.charAt(index1);
        if( last >= 48 && last <= 57 || last == 88 || last ==120 ){
            return true;
        }else{
            System.out.print("身份证号码错误,");
            return false;
        }
    }

    //判断手机号是否合规
    //长度为11位，不能以0为开头，必须都是数字
    public static boolean checkPhoneNumber(String phoneNumber){
        if(phoneNumber.length() != 11){
            System.out.print("手机号码长度错误,");
            return false;
        }
        if(phoneNumber.charAt(0) == '0'){
            System.out.print("手机号码错误,");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(c < 48 || c >57){
                System.out.print("手机号码错误,");
                return false;
            }
        }
        return true;
    }

}
