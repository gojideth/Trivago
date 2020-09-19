/*
 * Copyright (c) 12/9/2020.
 * created by Mateo Pinzon, Harrison Diaz y Juan Jose Ariza
 * All rights reserved
 */

package models;

public class CheckIn extends Event {

    /**
     * Para asignar la entrada a la habitaciones
     * @param room para mirar cada habitacion
     */
    public void assingRoom(Room room){
        room.setOcupation(true);
    }
}
