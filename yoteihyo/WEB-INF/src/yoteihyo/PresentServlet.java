package yoteihyo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PresentServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

		response.setContentType("text/plain; charset=Windows-31J");
        request.setCharacterEncoding("Windows-31J");

        String name1 = request.getParameter("yourName");

        String gyo = request.getParameter("gyo");
        int gyoInt = Integer.parseInt(gyo);

        String idNo = request.getParameter("IDNO");
        int idNoInt = Integer.parseInt(idNo);

        List<String> presentDay = new ArrayList<String>();
        List<String> presentPandC = new ArrayList<String>();

        for(int i =0; i < gyoInt; i++){
        	presentDay.add(request.getParameter("Niti" + i));
        	presentPandC.add(request.getParameter("presentPandC" + i));
        }

        for(int j = gyoInt; gyoInt < 8; gyoInt++){
        	presentDay.add("");
        	presentPandC.add("");
        }
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
        	PresentVo presentVo = new PresentVo();
        	presentVo.setIdNo(idNoInt);
        	presentVo.setName1(name1);
        	presentVo.setPresentDay(presentDay);
        	presentVo.setPresentProAndCon(presentPandC);


			PresentDataMake.InsertData(presentVo, gyoInt);
		} catch (Exception e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

        request.setAttribute("message", "�\�肪�m�肵�܂���");
        //out.println("���Ȃ��̓��́F" + name1 + textarea1 + textarea2);
        //out.println("�߂遫");
        //out.println("http://localhost:8080/yoteihyo/hello.jsp");

    	RequestDispatcher dispatcher = request.getRequestDispatcher("/present.jsp");

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
