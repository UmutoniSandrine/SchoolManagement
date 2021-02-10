/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolManagement.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

/**
 *
 * @author bitwayiki
 */
@Entity
public class Department implements Serializable {

    @ManyToOne
    private Faculty faculty;

    @Id
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Student> sts;
    @OneToMany(mappedBy = "department")
    private List<Course> crs;
    
    @Version
    private long version = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getSts() {
        return sts;
    }

    public void setSts(List<Student> sts) {
        this.sts = sts;
    }

    public List<Course> getCrs() {
        return crs;
    }

    public void setCrs(List<Course> crs) {
        this.crs = crs;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
    

}
