package videosvc.controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import videosvc.views.html.index;

public class WebApplication extends Controller {

    private final Logger.ALogger l = Logger.of(getClass());


    public Result index() {

        l.debug("index()");

        return ok(index.render("Your new application is ready."));
    }
}
