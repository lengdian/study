package utils;

import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil
{
	private static String driverName = "";
	private static String url = "";
	private static String username = "";
	private static String password = "";

	static
	{
		try
		{
			Properties properties = new Properties();
			InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(
					"utils/db.properties");
			properties.load(is);

			driverName = properties.getProperty("driver");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			url = properties.getProperty("url");

			Class.forName(driverName);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Connection getCon() throws Exception
	{
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * 获取Mybatis框架提供的SqlSession对象
	 * 
	 * @return
	 * @throws Exception
	 */
	public static SqlSession getSqlSession() throws Exception
	{
		// 通过配置文件获取数据库连接信息
		Reader reader = Resources
				.getResourceAsReader("config/Mybatis-Configuration.xml");

		// 通过配置信息构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(reader);

		// 通过factory打开数据库会话（得到SqlSession对象）
		SqlSession sqlSession = sqlSessionFactory.openSession();

		return sqlSession;
	}

}
