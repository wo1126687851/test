package com.example.demo.controller;

/**
 *
 * @api {post} /tts/apidoc  测试
 * @apiName 测试
 * @apiGroup 测试组
 * @apiVersion 2.0.0
 * @apiDescription 接口详细描述
 *
 * @apiParam {String} id 用户ID
 *
 * @apiSuccess {String} status 结果码
 * @apiSuccess {String} msg 消息说明
 * @apiSuccessExample Success-Response:
 *  HTTP/1.1 200 OK
 * {
 * status:0,
 * msg:'success',
 * data:{}
 *  }
 *
 *  @apiError All 对应<code>id</code>的用户没找到
 *
 *  @apiErrorExample {json} Error-Response:
 *  HTTP/1.1 200
 *  {
 *   code:-1,
 *   msg:'user not found',
 *   }
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@RestController
public class GetapiController {
    @RequestMapping(value = "/apidoc", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getapidoc(HttpServletRequest request) {
        String id = ServletRequestUtils.getStringParameter(request, "id", "");

        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "Hello World TTS");
        mav.setViewName("/tts/demo01");
        return mav;
    }
}