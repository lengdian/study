package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CommandService;

/**
 * 列表页面初始化控制
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	CommandService commandService = null;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		request.setAttribute("command", command);
		request.setAttribute("description", description);

		commandService = new CommandService();
		request.setAttribute("commandList",
				commandService.queryCommandList(command, description));

		request.getRequestDispatcher("WEB-INF/main.jsp").forward(request,
				response);
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

}
