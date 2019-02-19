package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 帐户dao接口
 */
public interface IAccountDao {

    // 查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    // 保存帐户信息
    @SelectKey(keyProperty = "id",statement = "select s_account.nextval from dual",before = true,resultType = Integer.class)
    @Insert("insert into account (id,name,money) values (#{id},#{name},#{money})")
    public void saveAccount(Account account);

}
