package com.zjw.oa.service.impl;



import com.zjw.oa.entity.Qjsq;
import com.zjw.oa.mapper.QjsqMapper;
import com.zjw.oa.service.QjsqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 *
 * @author ZhengJiawei
 * @date 2019-03-21 10:47:40
 */
@Service
public class QjsqServiceImpl implements QjsqService {

    @Resource
    private QjsqMapper qjsqMapper;

    @Override
    public void addQjsq(Qjsq qjsq) throws Exception {
        qjsqMapper.addQjsq(qjsq);
    }

    @Override
    public List<Qjsq> getQjList(Qjsq qjsq) {
        return qjsqMapper.getQjList(qjsq);
    }

    @Override
    public Qjsq getQj(Qjsq qjsq) {
        return qjsqMapper.getQj(qjsq);
    }

    @Override
    public void agreeQj(Qjsq qjsq) throws Exception {
        qjsqMapper.agreeQj(qjsq);
    }
}
