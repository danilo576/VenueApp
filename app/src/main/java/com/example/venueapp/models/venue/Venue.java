package com.example.venueapp.models.venue;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class Venue implements Parcelable {

    private String name;
    private String description;
    private Boolean is_open;
    private String welcome_message;
    private VenueImage image;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            dest.writeBoolean(this.is_open);
        }
        dest.writeString(this.welcome_message);
        dest.writeString(this.image.getThumbnail_small());
        dest.writeString(this.image.getThumbnail_medium());
        dest.writeString(this.image.getFullsize());
    }

    public Venue(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            this.is_open = in.readBoolean();
        }
        this.welcome_message = in.readString();
        this.image.setThumbnail_small(in.readString());
        this.image.setThumbnail_medium(in.readString());
        this.image.setFullsize(in.readString());
    }

    public static final Parcelable.Creator CREATOR = new Creator() {
        @Override
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        @Override
        public Venue[] newArray(int size) {
            return new Venue[size];
        }
    };

    public Venue(String name, String description, boolean is_open, String welcome_message, VenueImage image) {
        this.name = name;
        this.description = description;
        this.is_open = is_open;
        this.welcome_message = welcome_message;
        this.image = image;
    }

    public Venue() {
    }

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

    public boolean isIs_open() {
        return is_open;
    }

    public void setIs_open(boolean is_open) {
        this.is_open = is_open;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public VenueImage getImage() {
        return image;
    }

    public void setImage(VenueImage image) {
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return "Venue{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", is_open=" + is_open +
                ", welcome_message='" + welcome_message + '\'' +
                ", image=" + image +
                '}';
    }
}
