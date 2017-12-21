package com.haybook;

/**
 * Created by Albert.sepian on 12/21/2017.
 */
public interface UserRepository {
    void create(User user);

    void delete(User user);

    User getbyid(long id);
}
