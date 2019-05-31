package pravesh.jaipur.bit.halanx;

import android.util.Log;

public class SingleItem {
    private String furnish_type;
    private String house_type;
    private String accomodation_type;
    private String getAccomodation_allowed;
    private int bhk_count;
    private int latitude;
    private int longitude;
    private int radius;
    private int houserent;
    private int image;

    SingleItem() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFurnish_type() {
        return furnish_type;
    }

    public void setFurnish_type(String furnish_type) {
        this.furnish_type = furnish_type;
    }

    public String getHouse_type() {
        return house_type;
    }

    public void setHouse_type(String house_type) {
        this.house_type = house_type;
    }

    public String getAccomodation_type() {
        return accomodation_type;
    }

    public void setAccomodation_type(String accomodation_type) {
        this.accomodation_type = accomodation_type;
    }

    public String getGetAccomodation_allowed() {
        return getAccomodation_allowed;
    }

    public void setGetAccomodation_allowed(String getAccomodation_allowed) {
        this.getAccomodation_allowed = getAccomodation_allowed;
    }

    public int getBhk_count() {
        return bhk_count;
    }

    public void setBhk_count(int bhk_count) {
        this.bhk_count = bhk_count;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRent() {
        return houserent;
    }

    public void setRent(int houserent) {
        this.houserent = houserent;
    }

    SingleItem(int image, String furnish_type, String house_type, String accomodation_type, String getAccomodation_allowed, int bhk_count, int latitude, int longitude, int radius, int houserent) {
        this.furnish_type = furnish_type;
        this.house_type = house_type;
        this.accomodation_type = accomodation_type;
        this.getAccomodation_allowed = getAccomodation_allowed;
        this.bhk_count = bhk_count;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
        this.image = image;
        this.houserent = houserent;

        Log.d("pehli bar kam kra","pehla object bna kr behjra hu");
    }
}
