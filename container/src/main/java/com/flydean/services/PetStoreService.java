package com.flydean.services;


import com.flydean.daos.JpaAccountDao;
import com.flydean.daos.JpaItemDao;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Data
@Slf4j
public class PetStoreService {


    private JpaAccountDao accountDao;

    private JpaItemDao itemDao;

    public PetStoreService(JpaAccountDao accountDao){

    log.info("");
    }

    /**
     * 获取用户姓名列表
     * @return
     */
    public List<String> getUsernameList(){

        return new ArrayList<>();
    }

}
