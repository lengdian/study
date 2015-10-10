package com.hxy.servlet;

//使用servlet生成校验码
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取验证码图片 
 * 
 * 后台校验验证码注意字母大小写问题
 */
@WebServlet("/GetCaptchaImageServlet")
public class GetCaptchaImageServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();

		Color color = new Color(200, 150, 255);
		// 设置背景色
		g.setColor(color);
		g.fillRect(0, 0, 68, 22);

		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random r = new Random();
		int len = ch.length;
		int index;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++)
		{
			index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));
			g.drawString(ch[index] + "", (i * 15) + 3, 18);
			sb.append(ch[index]);
		}

		request.getSession().setAttribute("captcha", sb);

		ImageIO.write(bi, "jpg", response.getOutputStream());
	}

}
