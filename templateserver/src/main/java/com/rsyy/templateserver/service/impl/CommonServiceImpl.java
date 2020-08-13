package com.rsyy.templateserver.service.impl;

import com.rsyy.templateserver.service.CommonService;
import org.springframework.stereotype.Service;

/**
 * @author: wangzg
 * @create: 2020-08-13 22:54
 **/
@Service
public class CommonServiceImpl implements CommonService {
    @Override
    public String get() {
        return "子兴视夜，星河有烂";
    }
}
