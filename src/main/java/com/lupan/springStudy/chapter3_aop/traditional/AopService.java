package com.lupan.springStudy.chapter3_aop.traditional;

import java.sql.SQLException;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class AopService {

    public void get(){
        throw new RuntimeException("运行异常！");
    }

    public void find() throws SQLException {
        throw new SQLException("数据库异常！");
    }
}
