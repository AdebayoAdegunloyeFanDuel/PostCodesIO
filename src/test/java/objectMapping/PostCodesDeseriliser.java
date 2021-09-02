package objectMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PostCodesDeseriliser {
    private ObjectMapper objectMapper = new ObjectMapper();

    public PostCodesDTO requestData(File jsonFileLocation) {
        try {
            return objectMapper.readValue(jsonFileLocation, PostCodesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PostCodesDTO requestData(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, PostCodesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
