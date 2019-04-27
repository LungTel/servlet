package yoteihyo;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class YoteihyoServlet2 extends HttpServlet {

	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

		response.setContentType("text/plain; charset=Windows-31J");
        request.setCharacterEncoding("Windows-31J");

        String delete1 = request.getParameter("delete1");
        String delete2 = request.getParameter("delete2");
        
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
            System.out.println("ファイルに書き込めません");
        }
        }catch(IOException e){
            System.out.println(e);
          }
*/
        try {
            int intDelete1 = Integer.parseInt(delete1);
            int intDelete2 = Integer.parseInt(delete2);
        	
			DataMake.DeleteData(intDelete1,intDelete2);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

        request.setAttribute("message", "削除が完了しました");
        //out.println("あなたの入力：" + name1 + textarea1 + textarea2);
        //out.println("戻る↓");
        //out.println("http://localhost:8080/yoteihyo/hello.jsp");

    	RequestDispatcher dispatcher = request.getRequestDispatcher("/itiran.jsp");

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

