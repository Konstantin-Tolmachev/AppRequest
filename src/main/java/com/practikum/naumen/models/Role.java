package com.practikum.naumen.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")

public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private String name;
    private String rusName;
    @Transient
    @ManyToMany(mappedBy = "roles")
    @JoinColumn(name="roles_id") // Добавлено
    private Set<Account> accounts;

    public Role() {
    }

    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String name, String rusName) {
        this.id = id;
        this.name = name;
        this.rusName = rusName;
    }

    public Role(String name, String rusName) {
    }

    public Role(String id, String name, String rusName) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

    public Set<Account> getUsers() {
        return accounts;
    }

    public void setUsers(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}
