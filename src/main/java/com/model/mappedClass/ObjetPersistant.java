package com.model.mappedClass;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class ObjetPersistant implements Serializable {

//	private static final long serialVersionUID = 2299265250159488150L;
    private Long id;

    @Id
    @SequenceGenerator(name = "my_seq", sequenceName = "key_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_seq")
    @Column(length = 10, precision = 0, unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ObjetPersistant{" + "id=" + id + '}';
    }
    
    

}
