package com.example.dontstarvetogetherapi.domain;

import com.example.dontstarvetogetherapi.domain.enums.OddsOfSurvivalEnum;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "survivor")
@SecondaryTables({
        @SecondaryTable(name="survivor_perks", pkJoinColumns = @PrimaryKeyJoinColumn(name="survivor_id")),
        @SecondaryTable(name="survivor_skins", pkJoinColumns = @PrimaryKeyJoinColumn(name="survivor_id"))
})
public class Survivor {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column
     private String name;
     @Column
     private String title;
     @Column
     private String description;
     @Column
     private String motto;
     @Column(name = "favorite_food")
     private String favoriteFood;
     @Column
     private Date birthday;
     @Column(name = "odds_of_survival")
     private OddsOfSurvivalEnum oddsOfSurvival;
     @Column
     private int health;
     @Column
     private int hunger;
     @Column
     private int sanity;
     @ElementCollection
     @Column(name = "description", table = "survivor_perks")
     private List<String> perks = new ArrayList<>();
     @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
     @JoinColumn(name = "survivor_id")
     private List<SurvivorSkin> skins = new ArrayList<>();

     public Survivor(long id, String name, String title, String description, String motto, String favoriteFood, Date birthday, OddsOfSurvivalEnum oddsOfSurvival, int health, int hunger, int sanity) {
          this.id = id;
          this.name = name;
          this.title = title;
          this.description = description;
          this.motto = motto;
          this.favoriteFood = favoriteFood;
          this.birthday = birthday;
          this.oddsOfSurvival = oddsOfSurvival;
          this.health = health;
          this.hunger = hunger;
          this.sanity = sanity;
     }

     public Survivor() { }

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
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

     public String getFavoriteFood() {
          return favoriteFood;
     }

     public void setFavoriteFood(String favoriteFood) {
          this.favoriteFood = favoriteFood;
     }

     public Date getBirthday() {
          return birthday;
     }

     public void setBirthday(Date birthday) {
          this.birthday = birthday;
     }

     public OddsOfSurvivalEnum getOddsOfSurvival() {
          return oddsOfSurvival;
     }

     public void setOddsOfSurvival(OddsOfSurvivalEnum oddsOfSurvival) {
          this.oddsOfSurvival = oddsOfSurvival;
     }

     public int getHealth() {
          return health;
     }

     public void setHealth(int health) {
          this.health = health;
     }

     public int getHunger() {
          return hunger;
     }

     public void setHunger(int hunger) {
          this.hunger = hunger;
     }

     public int getSanity() {
          return sanity;
     }

     public void setSanity(int sanity) {
          this.sanity = sanity;
     }

     public List<String> getPerks() {
          return perks;
     }

     public void setPerks(List<String> perks) {
          this.perks = perks;
     }

     public List<SurvivorSkin> getSkins() {
          return skins;
     }

     public void setSkins(List<SurvivorSkin> skins) {
          this.skins = skins;
     }
}
