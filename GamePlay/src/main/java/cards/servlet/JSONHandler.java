package cards.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONHandler {

    static Logger logger = Logger.getLogger(JSONHandler.class.getSimpleName());

    public static JSONObject getJSONObjectFromRequest(HttpServletRequest req) throws IOException {
        StringBuffer jb = new StringBuffer();
        String line = null;

        try {
            BufferedReader reader = req.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "BufferReader unable to read from request");
        }

        try {
            return new JSONObject(jb.toString());
        } catch (JSONException e) {
            throw new IOException("Error parsing JSON request string");
        }
    }


}
