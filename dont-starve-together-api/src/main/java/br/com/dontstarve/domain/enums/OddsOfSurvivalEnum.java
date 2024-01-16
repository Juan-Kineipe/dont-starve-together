package com.example.dontstarvetogetherapi.domain.enums;

public enum OddsOfSurvivalEnum {
    Slim("Slim"),
    Grim("Grim"),
    None("None");

    private final String odds;

    OddsOfSurvivalEnum(String odds) {
        this.odds = odds;
    }

    public String getOdds() {
        return odds;
    }
}
