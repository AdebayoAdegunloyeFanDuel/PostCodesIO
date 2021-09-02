package objectMapping;


import HttpManagement.PostCodesHttpManager;
import configManagement.ConfigManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostCodesTests {
    private static PostCodesDTO postcodeRequestDto;
    private static PostCodesDTO postCodesDTO;

    @BeforeAll
    private static void setup(){
        File testFile = new File(ConfigManager.postcodeTestFileLocation());
        postCodesDTO = new PostCodesDeseriliser().requestData(new File(ConfigManager.postcodeTestFileLocation()));
//        postCodesDTO = postcodeRequestDto.getPostcode();
    }

//    @Test
//    public void getPostcodeTest(){
//        assertEquals( "Eh16 4GA", postcodeDto.getPostcode());
//    }

}
