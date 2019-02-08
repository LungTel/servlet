package yoteihyo;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class YoteihyoServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

		response.setContentType("text/plain; charset=Windows-31J");
        request.setCharacterEncoding("Windows-31J");

        String name1 = request.getParameter("name1");
        String textarea1 = request.getParameter("textarea1");
        String textarea2 = request.getParameter("textarea2");


/*
        PrintWriter out = response.getWriter();

        try{
        File file = new File("C:/eclipse/pleiades/servlet/yoteihyo/itiran.txt");
        if (checkBeforeWritefile(file)){
        FileWriter filewriter = new FileWriter(file, true);

        filewriter.write(name1 + ",");
        filewriter.write(textarea1 + ",");
        filewriter.write(textarea2 + "\r\n");

        filewriter.close();
        }else{
            System.out.println("�t�@�C���ɏ������߂܂���");
        }
        }catch(IOException e){
            System.out.println(e);
          }
*/
        try {
            YoteihyoVo yoteihyoVo = new YoteihyoVo();
            yoteihyoVo.setName1(name1);
            yoteihyoVo.setTextarea1(textarea1);
            yoteihyoVo.setTextarea2(textarea2);

			DataMake.InsertData(yoteihyoVo);
		} catch (Exception e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

        request.setAttribute("message", "�o�^���������܂���");
        //out.println("���Ȃ��̓��́F" + name1 + textarea1 + textarea2);
        //out.println("�߂遫");
        //out.println("http://localhost:8080/yoteihyo/hello.jsp");

    	RequestDispatcher dispatcher = request.getRequestDispatcher("/yoteihyo.jsp");

		dispatcher.forward(request, response);
	}

private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }

}
