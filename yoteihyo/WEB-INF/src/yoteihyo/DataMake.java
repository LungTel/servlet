package yoteihyo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataMake {

    public static void InsertData(YoteihyoVo yoteihyoVo)
    	throws Exception {

        Connection con = DBManager.getConnection();
        Statement smt = con.createStatement();

        //smt.executeUpdate("DELETE FROM YOTEI WHERE ID=4");
        //smt.executeUpdate("DELETE FROM YOTEI WHERE ID=1");
        // HSQL Database Managerで「SELECT MAX(ID) FROM YOTEI」を実行したら、C1と出るよ（idはint型で登録されている）
        ResultSet MaxId = smt.executeQuery("SELECT MAX(ID) FROM YOTEI");

        //
        if(MaxId.next()){ yoteihyoVo.setId(MaxId.getInt("MAX(ID)") + 1); }
       // yoteihyoVo.setId(2);

        int count = smt.executeUpdate(
        		"INSERT INTO YOTEI(ID, NAME, DETAIL, NITI, DATE) " +
        		"VALUES(" +
        				yoteihyoVo.getId() + ", '" +
        				yoteihyoVo.getName1() + "', '" +
        				yoteihyoVo.getTextarea1() + "', '" +
        				yoteihyoVo.getTextarea2() + "', '" +
        				yoteihyoVo.getDate() + "')");
        System.out.println("update count : " + count);

        ResultSet rs = smt.executeQuery(
        		"SELECT * FROM YOTEI");

        if(rs.next()){
			System.out.println(
					"ID=" + rs.getInt("ID")
					+ ",NAME=" + rs.getString("NAME")
					+ ",DETAIL=" + rs.getString("DETAIL")
					+ ",NITI=" + rs.getString("NITI")
				);
        }

        smt.close();
        con.close();
    }


    public List<YoteihyoVo> SelectData()
        	throws Exception {

        Connection con = DBManager.getConnection();
        Statement smt = con.createStatement();

        ResultSet All = smt.executeQuery("SELECT * FROM YOTEI");

        List<YoteihyoVo> lstYoteihyoVo = new ArrayList<YoteihyoVo>();

        while(All.next()){
        	YoteihyoVo yoteihyoVo = new YoteihyoVo();
        	yoteihyoVo.setId(All.getInt("ID"));
        	yoteihyoVo.setName1(All.getString("NAME"));
        	yoteihyoVo.setTextarea1(All.getString("DETAIL"));
        	yoteihyoVo.setTextarea2(All.getString("NITI"));
        	yoteihyoVo.setDate(All.getTimestamp("DATE"));

        	lstYoteihyoVo.add(yoteihyoVo);
        }
				return lstYoteihyoVo;

    }
    
    public static void DeleteData(int start, int end)
        	throws Exception {

        Connection con = DBManager.getConnection();
        Statement smt = con.createStatement();

        //ResultSet All = smt.executeQuery("SELECT * FROM YOTEI");

        List<YoteihyoVo> lstYoteihyoVo = new ArrayList<YoteihyoVo>();

        int deleteYotei = smt.executeUpdate(
        		"DELETE FROM YOTEI " +
        		"WHERE " +
        				 "ID BETWEEN " +
        				 start + " AND " + end );
        System.out.println("update deleteYoteicount : " + deleteYotei);
        
        int deletePresent = smt.executeUpdate(
        		"DELETE FROM PRESENT " +
        		"WHERE " +
        				 "IDNO BETWEEN " +
        				 start + " AND " + end );
        System.out.println("update deletePresentcount : " + deletePresent);
        	
        smt.close();
        con.close();
			//return lstYoteihyoVo;
    }
}
