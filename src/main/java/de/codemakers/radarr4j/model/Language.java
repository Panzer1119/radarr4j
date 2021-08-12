package de.codemakers.radarr4j.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Language {
    
    @SerializedName("id")
    private int id = -1;
    @SerializedName("name")
    private String name = null;
    
    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public Language setId(int id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public Language setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        final Language language = (Language) other;
        return id == language.id && Objects.equals(name, language.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    
    @Override
    public String toString() {
        return "Language{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
    
}
