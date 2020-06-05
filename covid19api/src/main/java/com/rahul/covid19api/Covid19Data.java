package com.rahul.covid19api;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/5/2020  4:38 PM
 * Rahul Gogyani
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "confirmed",
        "recovered",
        "critical",
        "deaths",
        "lastChange",
        "lastUpdate"
})
public class Covid19Data {
    @JsonProperty("confirmed")
    private Integer confirmed;
    @JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("critical")
    private Integer critical;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("lastChange")
    private Date lastChange;
    @JsonProperty("lastUpdate")
    private Date lastUpdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("confirmed")
    public Integer getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("critical")
    public Integer getCritical() {
        return critical;
    }

    @JsonProperty("critical")
    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("lastChange")
    public Date getLastChange() {
        return lastChange;
    }

    @JsonProperty("lastChange")
    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    @JsonProperty("lastUpdate")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "confirmed=" + confirmed +
                ", recovered=" + recovered +
                ", critical=" + critical +
                ", deaths=" + deaths +
                ", lastChange=" + lastChange +
                ", lastUpdate=" + lastUpdate +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
