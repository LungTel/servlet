package yoteihyo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PresentDataMake {

    public static void InsertData(PresentVo presentVo, int gyoInt)
    	throws Exception {

        Connection con = DBManager.getConnection();
        Statement smt = con.createStatement();

        //smt.executeUpdate("DELETE FROM YOTEI WHERE ID=4");
        //smt.executeUpdate("DELETE FROM YOTEI WHERE ID=1");
        ResultSet MaxId = smt.executeQuery("SELECT MAX(ID) FROM PRESENT");

        // HSQL Database Managerで「SELECT MAX(ID) FROM YOTEI」を実行したら、C1と出るよ（idはint型で登録されている）
        if(MaxId.next()){ presentVo.setId(MaxId.getInt("C1") + 1); }

        int count = smt.executeUpdate(
        		"INSERT INTO PRESENT(ID, IDNO, NAME, NITI1, NITI2, NITI3, NITI4, NITI5, NITI6, NITI7, NITI8, PANDC1, PANDC2, PANDC3, PANDC4, PANDC5, PANDC6, PANDC7, PANDC8, DATE) " +
        		"VALUES(" +
        				presentVo.getId() + ", " +
        				presentVo.getIdNo() + ", '" +
        				presentVo.getName1() + "', '" +
        				presentVo.getPresentDay().get(0) + "', '" +
        				presentVo.getPresentDay().get(1) + "', '" +
        				presentVo.getPresentDay().get(2) + "', '" +
        				presentVo.getPresentDay().get(3) + "', '" +
        				presentVo.getPresentDay().get(4) + "', '" +
        				presentVo.getPresentDay().get(5) + "', '" +
        				presentVo.getPresentDay().get(6) + "', '" +
        				presentVo.getPresentDay().get(7) + "', '" +
        				presentVo.getPresentProAndCon().get(0) + "', '" +
        				presentVo.getPresentProAndCon().get(1) + "', '" +
        				presentVo.getPresentProAndCon().get(2) + "', '" +
        				presentVo.getPresentProAndCon().get(3) + "', '" +
        				presentVo.getPresentProAndCon().get(4) + "', '" +
        				presentVo.getPresentProAndCon().get(5) + "', '" +
        				presentVo.getPresentProAndCon().get(6) + "', '" +
        				presentVo.getPresentProAndCon().get(7) + "', '" +
        				presentVo.getDate() + "')");
        System.out.println("update count : " + count);

        ResultSet rs = smt.executeQuery(
        		"SELECT * FROM PRESENT WHERE ID=6");

        if(rs.next()){
			System.out.println(
					"ID=" + rs.getInt("ID")
					+ ",NAME=" + rs.getString("NAME")
					+ ",NITI1=" + rs.getString("NITI1")
					+ ",PANDC1=" + rs.getString("PANDC1")
				);
        }

        smt.close();
        con.close();
    }


    public List<PresentVo> SelectData(int idNo)
        	throws Exception {

        Connection con = DBManager.getConnection();
        Statement smt = con.createStatement();

        ResultSet All = smt.executeQuery("SELECT * FROM PRESENT WHERE IDNO = " + idNo);

        List<PresentVo> lstPresentVo = new ArrayList<PresentVo>();

        while(All.next()){
        	PresentVo presentVo = new PresentVo();
        	presentVo.setId(All.getInt("ID"));
        	presentVo.setName1(All.getString("NAME"));

        	List<String> presentDay = new ArrayList<String>();
	        	presentDay.add(All.getString("NITI1"));
	        	presentDay.add(All.getString("NITI2"));
	        	presentDay.add(All.getString("NITI3"));
	        	presentDay.add(All.getString("NITI4"));
	        	presentDay.add(All.getString("NITI5"));
	        	presentDay.add(All.getString("NITI6"));
	        	presentDay.add(All.getString("NITI7"));
	        	presentDay.add(All.getString("NITI8"));

        	presentVo.setPresentDay(presentDay);

        	List<String> presentProAndCon = new ArrayList<String>();
	        	presentProAndCon.add(All.getString("PANDC1"));
	        	presentProAndCon.add(All.getString("PANDC2"));
	        	presentProAndCon.add(All.getString("PANDC3"));
	        	presentProAndCon.add(All.getString("PANDC4"));
	        	presentProAndCon.add(All.getString("PANDC5"));
	        	presentProAndCon.add(All.getString("PANDC6"));
	        	presentProAndCon.add(All.getString("PANDC7"));
	        	presentProAndCon.add(All.getString("PANDC8"));

        	presentVo.setPresentProAndCon(presentProAndCon);

        	presentVo.setDate(All.getTimestamp("DATE"));

        	lstPresentVo.add(presentVo);
        }
				return lstPresentVo;

    }
}
