package com.example.venueapp.business.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class Venue implements Parcelable {

    private String name;
    private String description;
    private Boolean is_open;
    private String welcome_message;
    private String image;

    protected Venue(Parcel in) {
        name = in.readString();
        description = in.readString();
        byte tmpIs_open = in.readByte();
        is_open = tmpIs_open == 0 ? null : tmpIs_open == 1;
        welcome_message = in.readString();
        image = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeByte((byte) (is_open == null ? 0 : is_open ? 1 : 2));
        dest.writeString(welcome_message);
        dest.writeString(image);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Venue> CREATOR = new Creator<Venue>() {
        @Override
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        @Override
        public Venue[] newArray(int size) {
            return new Venue[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_open() {
        return is_open;
    }

    public void setIs_open(Boolean is_open) {
        this.is_open = is_open;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venue)) return false;
        Venue venue = (Venue) o;
        return getName().equals(venue.getName()) && getDescription().equals(venue.getDescription()) && Objects.equals(getIs_open(), venue.getIs_open()) && Objects.equals(getWelcome_message(), venue.getWelcome_message()) && Objects.equals(getImage(), venue.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getIs_open(), getWelcome_message(), getImage());
    }
}
