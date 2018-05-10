package com.austinegwa.Repositorys;

import com.austinegwa.Test.DbTest;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gwaza on 4/16/2018.
 */
public interface TestRepo  extends CrudRepository<DbTest, Integer> {
}
