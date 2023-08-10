package com.ruoyi;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanPrinter {

    @Autowired
    private ApplicationContext applicationContext;

    public void printBeans() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            if (beanName.contains("sysRoleMapper")) {
                System.out.println("包含sysRoleMapper的组件为:" + beanName);
            } else {
                // Scanner sc = new Scanner(System.in);
                // System.out.print("请输入第一个字符串：");
                // System.out.println("组件为:" + beanName);
            }
        }
    }
}
