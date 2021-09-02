package objectMapping;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostcodeCodesDto {
    @JsonProperty("admin_district")
    private String adminDistrict;
    @JsonProperty("admin_county")
    private String adminCounty;
    @JsonProperty("admin_ward")
    private String adminWard;
    private String parish;
    @JsonProperty("parliamentary_constituency")
    private String parliamentaryConstituency;
    private String ccg;
    @JsonProperty("ccg_id")
    private String ccgId;
    @JsonProperty("ccg_code")
    private String ccgCode;
    private String ced;
    private String nuts;
    private String lau2;
    private String lsoa;
    private String msoa;

    public String getAdminDistrict() {
        return adminDistrict;
    }

    public String getAdminCounty() {
        return adminCounty;
    }

    public String getAdminWard() {
        return adminWard;
    }

    public String getParish() {
        return parish;
    }

    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    public String getCcg() {
        return ccg;
    }

    public String getCcgId() {
        return ccgId;
    }

    public String getCcgCode() {
        return ccgCode;
    }

    public String getCed() {
        return ced;
    }

    public String getNuts() {
        return nuts;
    }

    public String getLau2() {
        return lau2;
    }

    public String getLsoa() {
        return lsoa;
    }

    public String getMsoa() {
        return msoa;
    }
}
