package io.renren.modules.policy.controller;


import io.renren.modules.policy.service.PolicyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/policytype")
public class PolicyTypeController {
    @Autowired
    PolicyTypeService policyTypeService;

    @PostMapping("/queryTypeName")
    public List<Map<String,Object>> queryTypeName(){
        List<Map<String,Object>> result= policyTypeService.queryTypeName();
        return result;
    }
}
