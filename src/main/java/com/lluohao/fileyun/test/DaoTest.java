package com.lluohao.fileyun.test;

import com.lluohao.fileyun.dao.FileYunDao;
import com.lluohao.fileyun.domain.YunFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luohao07 on 2017/9/20.
 */
public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        YunFile yunFile = new YunFile();
        yunFile.setName("mysql必知必会");
        yunFile.setAuth("admin");
        yunFile.setContent("/data/file/yunnsrklrbmdeewxf.pdf");
        FileYunDao fileYunDao = context.getBean(FileYunDao.class);
        fileYunDao.insert(yunFile);
        System.out.println(yunFile.getId());
    }
}
