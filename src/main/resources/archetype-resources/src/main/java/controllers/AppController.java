#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import com.linchproject.core.Params;
import com.linchproject.core.Result;
import com.linchproject.framework.Controller;

public class AppController extends Controller {

    public Result index(Params params) {
        return render("index", context().put("hello", "Hello World"));
    }
}
