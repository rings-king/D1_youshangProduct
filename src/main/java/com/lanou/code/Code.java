package com.lanou.code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import cn.dsna.util.images.ValidateCode;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
 * 人类与计算机的图灵测试(验证码)
 */
@CrossOrigin
public class Code extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request.setCharacterEncoding("utf-8");
        //response.setContentType("text/html;charset=UTF-8");
        //fun1(response);
        //创建一个vaildateCode 对象
        ValidateCode validateCode = new ValidateCode(75, 31, 4, 9);
        //获取随机出来的验证码
        String code = validateCode.getCode();
        System.out.println(code);
        //将验证码存到 session中
        HttpSession session = request.getSession();
        session.setAttribute("mycode", code);
        //将验证码写回网页
        validateCode.write(response.getOutputStream());

    }

    private void fun1(HttpServletResponse response) throws IOException {
        //定义验证码图片的宽高
        int width = 100;
        int height = 25;
        //创建画布
        //参数3 选择图片的属性
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        //从画布中获取画笔
        Graphics graphics = image.getGraphics();
        //设置背景颜色
        graphics.setColor(Color.PINK);
        //填充背景颜色(留出边框)
        graphics.fillRect(1, 1, width-2, height-2);
        //设置边框颜色
        graphics.setColor(Color.cyan);
        graphics.drawRect(0, 0, width-1, height-1);
        //设置字体颜色 类型 尺寸
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("宋体", Font.BOLD, 20));
        //随机4个数字
        Random random = new Random();
        //[0,9) 0-9 的整数
        //int num = random.nextInt(10);
        //声明x坐标
        int possitionX =20;
        //将数字画画布上
        for (int i = 0; i < 4; i++) {
            // 把随机数画到画布上 x y 距离画布原点的坐标
            graphics.drawString(random.nextInt(10)+"", possitionX, 20);
            possitionX+=20;
        }
        //画干扰线
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
        }
        //响应回页面中
        ImageIO.write(image, "jpg", response.getOutputStream());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}