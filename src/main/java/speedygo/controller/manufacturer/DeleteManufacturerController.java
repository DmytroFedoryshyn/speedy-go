package speedygo.controller.manufacturer;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import speedygo.lib.Injector;
import speedygo.service.ManufacturerService;

public class DeleteManufacturerController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("speedygo");
    private final ManufacturerService manufacturerService = (ManufacturerService) injector
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        manufacturerService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/manufacturers");
    }
}
