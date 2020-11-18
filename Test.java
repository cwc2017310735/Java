package pack03;

import java.util.function.DoubleToIntFunction;

public class Test {
    public static void main(String[] args) {
        DC zhangsan = new DC("张三","男",20,5000,3000);
        DC lisi = new DC("李四","男",20,5000,4000);
//        System.out.println(zhangsan.name + "税前年收入为：" + zhangsan.tongji());
//        System.out.println(zhangsan.name + "税后年收入为：" + DC.jiaoshui(zhangsan.tongji()));
//        System.out.println(lisi.name + "税前年收入为: " + lisi.tongji());
//        System.out.println(lisi.name + "税后年收入为：" + DC.jiaoshui(lisi.tongji()));
        System.out.println("姓名： " + zhangsan.name + " 性别： " + zhangsan.sex + " 年龄： " + zhangsan.age + " 学费: " + zhangsan.tuition +
                " 月薪: " + zhangsan.salary + " 税前年收入： " + zhangsan.tongji() + " 税后年收入: " + zhangsan.jiaoshui(zhangsan.tongji()));
        System.out.println("姓名： " + lisi.name + " 性别： " + lisi.sex + " 年龄： " + lisi.age + " 学费: " + lisi.tuition +
                " 月薪: " + lisi.salary + " 税前年收入： " + lisi.tongji() + " 税后年收入: " + lisi.jiaoshui(lisi.tongji()));
//        System.out.println(zhangsan.getSalary());
//        System.out.println(zhangsan.getTuition());
        System.out.println(zhangsan.name);
        zhangsan.setSalary(3000);
//        zhangsan.setTuition(5000);
//        System.out.println(lisi.getSalary());
//        System.out.println(lisi.getTuition());
        System.out.println(lisi.name);
        lisi.setSalary(4000);
//        lisi.setTuition(5000);
    }
}
