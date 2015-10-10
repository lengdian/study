package dao.interf;

import java.util.List;

import bean.Command;

/**
 * 与Command配置文件相对应的接口
 * 
 * @author hxy
 * 
 */
public interface ICommand
{
	public List<Command> queryList();
}
