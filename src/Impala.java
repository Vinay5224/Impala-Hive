import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Impala {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.cloudera.impala.jdbc41.Driver");	
				//"com.simba.impala.jdbc4.Driver");
					
		Connection con = DriverManager.getConnection("jdbc:impala://18.210.41.129:9000/resultdb;AuthMech=0;UID=cloudera;PWD=cloudera");//, "cloudera", "cloudera");
			//	DriverManager.getConnection("jdbc:impala://34.231.82.9:21050/resultdb;auth=noSasl", "cloudera", "cloudera");
				//AuthMech=0;transportMode=http;httpPath=cliservice","","");//auth=noSasl
		System.out.println("connected");


	}

}
