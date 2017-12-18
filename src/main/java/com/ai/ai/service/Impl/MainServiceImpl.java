/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ai.ai.service.Impl;

import com.ai.ai.model.MainEntity;
import com.ai.ai.repository.MainRepository;
import com.ai.ai.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service("mainServiceImpl")
public class MainServiceImpl implements MainService {

    @Autowired
    @Qualifier("mainRepository")
    private MainRepository mainRepository;

    @Transactional
    public void mainMethod(){


        MainEntity one = mainRepository.findOne(new Long(0));
        MainEntity two = mainRepository.findOne(new Long(1));
        one.setValue(new BigDecimal(0));
        mainRepository.save(one);

        two.setValue(new BigDecimal(100));
        mainRepository.save(two);


    }

    public void batchInsert(){
        String[] napis = new String[100000];

    }
}
