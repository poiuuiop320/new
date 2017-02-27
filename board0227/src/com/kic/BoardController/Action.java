package com.kic.BoardController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.Controller.ActionForward;

public interface Action
{
 public ActionForward execute(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException;

}
