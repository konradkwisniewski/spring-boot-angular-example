
package com.ai.ai.controller;

import com.ai.ai.model.MainEntity;
import com.ai.ai.repository.MainRepository;
import com.ai.ai.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ss")
public class MainController {

    @Autowired
    @Qualifier("mainServiceImpl")
    private MainService mainService;

    @RequestMapping(name = "/ds/(id)", method = RequestMethod.GET)
    public MainEntity saveMainEnitity( @RequestParam(name ="obj1") @Validated MainEntity main){
        return null;
    }
}
