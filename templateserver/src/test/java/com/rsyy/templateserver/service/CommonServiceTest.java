package com.rsyy.templateserver.service;

import com.rsyy.templateserver.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author: wangzg
 * @create: 2020-08-13 23:07
 **/
public class CommonServiceTest extends BaseTest {
    @BeforeClass
    public static void beforeClass(){
    }

    @Before
    public void init(){
    }

    @Resource
    private CommonService service;


    @Test
    public void testTree(){
        Assert.assertNotNull("不为空",service);
    }
}
