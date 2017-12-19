package com.haybook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Albert.sepian on 12/19/2017.
 */
@Table(name="USER")
@Entity
public class User {
    @Id
    private int id;
    @Column
    private String username;
    @Column
    private String email;
}
