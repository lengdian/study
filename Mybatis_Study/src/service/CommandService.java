package service;

import java.util.List;

import bean.Command;
import dao.CommandDao;

public class CommandService
{
	CommandDao commandDao = null;

	public List<Command> queryCommandList(String command, String description)
	{
		commandDao = new CommandDao();

		return commandDao.queryCommandList(command, description);
	}
}
