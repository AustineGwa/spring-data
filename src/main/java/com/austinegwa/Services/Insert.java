package com.austinegwa.Services;

import com.austinegwa.Repositorys.TestRepo;
import com.austinegwa.Test.DbTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gwaza on 4/16/2018.
 */

@Service
public class Insert {

    @Autowired
    TestRepo testRepo;

    public void insertData(DbTest data){

        testRepo.save(data);

    }
}
