package com.majidsworld.foodaround.resources;

import com.majidsworld.foodaround.telegram.Message;
import com.majidsworld.foodaround.telegram.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/getUpdates")
@Consumes(MediaType.APPLICATION_JSON)
public class UpdateResource {

    @POST
    public void getUpdate(Update update) {
        String messageEntityType;
        Logger log = LoggerFactory.getLogger("mylogger");
        log.error(update.toString());

        Message updateMessage = update.getMessage();
        int chatID = update.getMessage().getChat().getId();

        if (update.getMessage().getEntities().size() > 0) {
            messageEntityType = update.getMessage().getEntities().get(0).getType();
        } else {
            messageEntityType = "empty";
        }
        
    }

}
