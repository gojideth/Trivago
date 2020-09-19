/*
 * Copyright (c) 12/9/2020.
 * created by Mateo Pinzon, Harrison Diaz y Juan Jose Ariza
 * All rights reserved
 */

package models;

/**
 * modelado segun diagrama Admin, sin niguna logica
 */

public class Admin extends Person{

    private String passaword;
    private String season;

    public Admin(String name, long id, String passaword) {
        super(name, id);
        this.passaword = passaword;
    }

    public void changeSeason(String season){
        switch (season.toLowerCase()){
            case "verano":
                this.season = season;
                break;
            case "invierno":
                this.season = season;
                break;
            case "otoño":
                this.season = season;
                break;
            case "primavera":
                this.season = season;
                break;
        }
    }

    public Quality viewQuality(){
        Quality aux = Quality.ECONOMIC;
        return aux;
    }

    public void Status(User user){

    }

    /**
     * Revision de diagrama
     */
    public void reservation(){

    }
}
