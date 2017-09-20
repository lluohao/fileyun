package com.lluohao.fileyun.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luohao07 on 2017/9/20.
 */
@Controller
public class FileController {
    @RequestMapping("/download/{fileId}")
    public
    @ResponseBody
    Object download(@PathVariable int fileId, HttpServletRequest request, HttpServletResponse response) {
        return fileId;
    }
}
