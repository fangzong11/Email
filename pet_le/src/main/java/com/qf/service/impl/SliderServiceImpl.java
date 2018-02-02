package com.qf.service.impl;

import com.qf.dao.SliderDao;
import com.qf.pojo.Slider;
import com.qf.service.SliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SliderServiceImpl implements SliderService {

    @Autowired
    private SliderDao sliderDao;

    @Override
    public List<Slider> getSliderList() {
        return sliderDao.getSliderList();
    }
}
