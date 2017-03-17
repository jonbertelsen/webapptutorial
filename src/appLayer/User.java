package appLayer;

/**
 * Created by jonb on 17/03/17.
 */
public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword)
    {
        if (sUserName.equals("jonb@kea.dk") && sUserPassword.equals("test123"))
        {
            return true;
        }

        return false;

    }



}
