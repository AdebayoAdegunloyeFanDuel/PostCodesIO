import HttpManagement.HttpManager;
import HttpManagement.PostCodesHttpManager;

public class Main {

    public static void main(String[] args) {
        PostCodesHttpManager httpManager = new PostCodesHttpManager("EH164GA");
        httpManager.makeUrlCall();

        System.out.println(httpManager.getResponseBody());
    }
}
