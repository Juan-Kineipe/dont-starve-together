package br.com.dontstarve.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "survivor_skins")
public class SurvivorSkin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String collection;
    @Column
    private String description;
    @Column
    private String motto;

    public SurvivorSkin(Long id, String name, String collection, String description, String motto) {
        this.id = id;
        this.name = name;
        this.collection = collection;
        this.description = description;
        this.motto = motto;
    }

    public SurvivorSkin() { }

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

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
