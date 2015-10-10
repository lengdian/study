package bean;

import java.util.List;

/**
 * 与指令表对应的实体类
 * 
 * @author xy
 * 
 */
public class Command
{
	private int id;
	private String command;
	private String description;
	private String content;
	private List<Content> contentList;

	public List<Content> getContentList()
	{
		return contentList;
	}

	public void setContentList(List<Content> contentList)
	{
		this.contentList = contentList;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCommand()
	{
		return command;
	}

	public void setCommand(String command)
	{
		this.command = command;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

}
