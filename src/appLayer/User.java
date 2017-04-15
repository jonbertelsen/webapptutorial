package appLayer;

import dataLayer.*;
/**
 * Created by jonb on 17/03/17.
 */
public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword)
    {

        userDB userDBObject = new userDB();

        return userDBObject.isValidUserLogin(sUserName,sUserPassword);

    }


}
