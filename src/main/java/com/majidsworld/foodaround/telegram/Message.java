package com.majidsworld.foodaround.telegram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "message_id",
        "from",
        "chat",
        "date",
        "text",
        "entities"
})
public class Message {

    @JsonProperty("message_id")
    private Integer messageId;
    @JsonProperty("from")
    private From from;
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("text")
    private String text;
    @JsonProperty("entities")
    private List<Entity> entities = new ArrayList<Entity>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Message() {
    }

    /**
     * @param text
     * @param chat
     * @param from
     * @param date
     * @param messageId
     * @param entities
     */
    public Message(Integer messageId, From from, Chat chat, Integer date, String text, List<Entity> entities) {
        this.messageId = messageId;
        this.from = from;
        this.chat = chat;
        this.date = date;
        this.text = text;
        this.entities = entities;
    }

    /**
     * @return The messageId
     */
    @JsonProperty("message_id")
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * @param messageId The message_id
     */
    @JsonProperty("message_id")
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * @return The from
     */
    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    /**
     * @param from The from
     */
    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    /**
     * @return The chat
     */
    @JsonProperty("chat")
    public Chat getChat() {
        return chat;
    }

    /**
     * @param chat The chat
     */
    @JsonProperty("chat")
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    /**
     * @return The date
     */
    @JsonProperty("date")
    public Integer getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    @JsonProperty("date")
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * @return The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The entities
     */
    @JsonProperty("entities")
    public List<Entity> getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    @JsonProperty("entities")
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
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