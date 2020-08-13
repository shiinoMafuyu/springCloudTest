package com.rsyy.templateserver.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author: wangzg
 * @create: 2020-08-13 23:03
 **/
public class CommonControllerTest {

//    @Autowired
    @Resource
    private CommonController controller = new CommonController();

    @Before
    public void before() {
    }

    @Test
    public void testTree() throws Exception {
        Assert.notNull(controller, "结果不为空");
    }
}
