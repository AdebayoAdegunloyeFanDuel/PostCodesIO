package objectMapping;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCodesDTO {
    private String postcode;
    private int quality;
    private long eastings;
    private long northings;
    private String country;
    @JsonProperty("nhs_ha")
    private String nhsHa;
    private double longitude;
    private double latitude;
    @JsonProperty("european_electoral_region")
    private String europeanElectoralRegion;
    @JsonProperty("primary_care_trust")
    private String primaryCareTrust;
    private String region;
    private String lsoa;
    private String msoa;
    private String incode;
    private String outcode;
    @JsonProperty("parliamentary_constituency")
    private String parliamentaryConstituency;
    @JsonProperty("admin_district")
    private String adminDistrict;
    private String parish;
    @JsonProperty("admin_county")
    private String adminCounty;
    @JsonProperty("admin_ward")
    private String adminWard;
    private String ced;
    private String ccg;
    private String nuts;
    private PostcodeCodesDto codes;

    public String getPostcode() {
        return postcode;
    }

    public int getQuality() {
        return quality;
    }

    public long getEastings() {
        return eastings;
    }

    public long getNorthings() {
        return northings;
    }

    public String getCountry() {
        return country;
    }

    public String getNhsHa() {
        return nhsHa;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getEuropeanElectoralRegion() {
        return europeanElectoralRegion;
    }

    public String getPrimaryCareTrust() {
        return primaryCareTrust;
    }

    public String getRegion() {
        return region;
    }

    public String getLsoa() {
        return lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public String getIncode() {
        return incode;
    }

    public String getOutcode() {
        return outcode;
    }

    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    public String getAdminDistrict() {
        return adminDistrict;
    }

    public String getParish() {
        return parish;
    }

    public String getAdminCounty() {
        return adminCounty;
    }

    public String getAdminWard() {
        return adminWard;
    }

    public String getCed() {
        return ced;
    }

    public String getCcg() {
        return ccg;
    }

    public String getNuts() {
        return nuts;
    }

    public PostcodeCodesDto getCodes() {
        return codes;
    }
}