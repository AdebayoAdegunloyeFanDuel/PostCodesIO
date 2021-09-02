package HttpManagement;

import configManagement.ConfigManager;

public class PostCodesHttpManager extends HttpManager{

    public PostCodesHttpManager(String postcode) {
        super(ConfigManager.baseUrl() + ConfigManager.postcodesEndpoint() + "/" + postcode);
    }
}
