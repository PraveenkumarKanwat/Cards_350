package cards.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class RequestHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("source"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!req.getContentType().equals("application/json")) {
            resp.sendError(500, "Request is not in 'application/json' format");
            return;
        }
        JSONObject jsonRequestObject = JSONHandler.getJSONObjectFromRequest(req);

        String s = jsonRequestObject.getString("action");
        if ("DISPLAY_CARDS".equals(s)) {
            System.out.println();
        }

        System.out.println(jsonRequestObject.keys().next());

        String name = jsonRequestObject.getString("name");
        resp.setContentType("application/json");
        JSONObject jsonResponseObject = new JSONObject();
        jsonResponseObject.put("message", "Welcome " + name);
        PrintWriter out = resp.getWriter();
        out.print(jsonResponseObject);
        out.flush();
    }
}
