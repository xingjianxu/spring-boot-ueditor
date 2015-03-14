package com.kuaidi.dp.oecdemo.ueditor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.ueditor.MyActionEnter;

/**
 * @author Sunxiupeng on 2015年3月14日
 */
@Controller
public class UEditorController {

    @Value("${config.json.path}")
    private String configJSONPath;

    @RequestMapping("/controller")
    public @ResponseBody String controller(HttpServletRequest request, HttpServletResponse response) throws IOException, JSONException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html");
        @SuppressWarnings("resource")
        ApplicationContext appContext = new ClassPathXmlApplicationContext();
        String baseState = new MyActionEnter(request, appContext.getResource(configJSONPath).getInputStream()).exec();
        // response.getWriter().write(baseState);
        return baseState;
    }

}
