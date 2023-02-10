package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    private String value;


    public PositionType(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PositionType)) return false;
        PositionType position = (PositionType) o;
        return getId() == position.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
