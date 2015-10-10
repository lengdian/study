package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.interf.ICommand;
import utils.DBUtil;
import bean.Command;

public class CommandDao
{
	private SqlSession sqlSession;

	/**
	 * 根据查询条件查询指令列表
	 * 
	 * @param command
	 *            指令
	 * @param description
	 *            描述
	 * @return
	 */
	public List<Command> queryCommandList(String command, String description)
	{
		List<Command> commandList = null;
		try
		{
			// 获取SqlSession对象,默认设置为不自动提交
			sqlSession = DBUtil.getSqlSession();

			Command com = new Command();
			com.setCommand(command);
			com.setDescription(description);
			// 通过SqlSession对象执行sql语句
			commandList = sqlSession
					.selectList("Command.queryCommandList", com);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (sqlSession != null)
			{
				sqlSession.close();
			}
		}

		return commandList;
	}

	public List<Command> queryList()
	{
		List<Command> commandList = null;
		try
		{
			// 获取SqlSession对象,默认设置为不自动提交
			sqlSession = DBUtil.getSqlSession();

			// 通过SqlSession对象执行sql语句
			// commandList = sqlSession.selectList("Command.queryList");
			// 采用接口式编程  使用动态代理实现
			ICommand iCommand = sqlSession.getMapper(ICommand.class);
			commandList = iCommand.queryList();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (sqlSession != null)
			{
				sqlSession.close();
			}
		}

		return commandList;
	}

	public static void main(String[] args)
	{
		CommandDao dao = new CommandDao();
		List<Command> commandList = dao.queryList();
		System.out.println(commandList);
	}

}
