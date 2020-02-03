package com.dronalia.dto;

import com.dronalia.enumeradas.EnumSkinTematica;
import com.dronalia.enumeradas.EnumSkinTipus;

import java.util.Objects;

public class sSkin {

    private int id;
    private String name;
    private String photo;
    private Enum<EnumSkinTematica> skinTematicaEnum;

    public Skin(int id, String name, String photo, Enum<EnumSkinTematica> skinTematicaEnum) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.skinTematicaEnum = skinTematicaEnum;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Enum<EnumSkinTematica> getSkinTematicaEnum() {
        return skinTematicaEnum;
    }

    public void setSkinTematicaEnum(Enum<EnumSkinTematica> skinTematicaEnum) {
        this.skinTematicaEnum = skinTematicaEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skin skin = (Skin) o;
        return id == skin.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Skin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", skinTematicaEnum=" + skinTematicaEnum +
                '}';
    }
}
