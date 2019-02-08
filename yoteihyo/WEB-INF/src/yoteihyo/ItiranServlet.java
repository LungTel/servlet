package yoteihyo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItiranServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

		try {
			@SuppressWarnings("unused")
			List<YoteihyoVo> lstYoteihyoVo = new ArrayList<YoteihyoVo>();
			DataMake dataMake = new DataMake();

			lstYoteihyoVo = dataMake.SelectData();

			request.setAttribute("lstYoteihyoVo", lstYoteihyoVo);
			System.out.println("成功!");
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/itiran.jsp");

		dispatcher.forward(request, response);

	}

}

