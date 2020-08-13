package com.rsyy.templateserver;

import com.rsyy.templateserver.controller.ABatchController;
import com.rsyy.templateserver.service.ABatchService;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ABatchService.class,
        ABatchController.class
})
public class TemplateserverApplicationTests {
    

}
