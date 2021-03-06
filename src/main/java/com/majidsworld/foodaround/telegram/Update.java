package com.majidsworld.foodaround.telegram;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "update_id",
        "message"
})
public class Update {

    @JsonProperty("update_id")
    private Integer updateId;
    @JsonProperty("message")
    private Message message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Update() {
    }

    /**
     *
     * @param message
     * @param updateId
     */
    public Update(Integer updateId, Message message) {
        this.updateId = updateId;
        this.message = message;
    }

    /**
     *
     * @return
     * The updateId
     */
    @JsonProperty("update_id")
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     *
     * @param updateId
     * The update_id
     */
    @JsonProperty("update_id")
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     *
     * @return
     * The message
     */
    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}