package com.goit.module3.musicalinstrument;

import java.util.List;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guiater;

    public List<com.goit.module3.musicalinstrument.Trumpet> getTrumpet() {
        return Trumpet;
    }

    public void setTrumpet(List<com.goit.module3.musicalinstrument.Trumpet> trumpet) {
        Trumpet = trumpet;
    }

    public List<com.goit.module3.musicalinstrument.Piano> getPiano() {
        return Piano;
    }

    public void setPiano(List<com.goit.module3.musicalinstrument.Piano> piano) {
        Piano = piano;
    }

    public List<Guitar> getGuiater() {
        return Guiater;
    }

    public void setGuiater(List<Guitar> guiater) {
        Guiater = guiater;
    }
}
