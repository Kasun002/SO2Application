/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.ApplicationModel;
import Model.DBConnection;
import Model.DBHandel;
import Model.DistricModel;
import Model.SearchModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abayw
 */
public class ApplicationControler {

    public static void addDetail(ApplicationModel a) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT IGNORE INTO application VALUES ('" + a.getSerial_no() + "','" + a.getName_init() + "','" + a.getName_call() + "','" + a.getProvince() + "','" + a.getDistric() + "','" + a.getHome_town() + "','" + a.getSex() + "',"
                    + "'" + a.getNic() + "','" + a.getDOB() + "','" + a.getAddress() + "','" + a.getAddress_temp() + "','" + a.getMobile_no() + "','" + a.getHome_no() + "','" + a.getOther_no() + "','" + a.getEmail_1() + "','" + a.getEmail_2() + "','" + a.getOl_summary() + "'"
                    + ",'" + a.getOl_sinhala() + "','" + a.getOl_math() + "','" + a.getOl_english() + "','" + a.getAl_status() + "','" + a.getAl_streame() + "','" + a.getAl_s1() + "','" + a.getAl_s2() + "','" + a.getAl_s3() + "','" + a.getAl_english() + "','" + a.getAl_zscore() + "','" + a.getDiploma() + "'"
                    + ",'" + a.getSetificate() + "','" + a.getUniversity() + "','" + a.getOther_prof_qulification() + "','" + a.getSport() + "','" + a.getSociety() + "','" + a.getLeadership() + "','" + a.getLeadership_detail() + "'"
                    + ",'" + a.getPerformance_detail() + "','" + a.getOther_detail() + "','" + a.getMarks() + "','" + a.getStatus() + "')";
            System.out.println(query);
            int res = DBHandel.setData(con, query);

            if (res != 0) {
                JOptionPane.showMessageDialog(null, "Person Added Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Adding Fail");
            System.out.println("Exception :- "+e);
            e.printStackTrace();
        }
    }

    public static ArrayList<DistricModel> getPersonByName(String Name) throws ClassNotFoundException, SQLException, Exception {//serch item 
        String qry = "Select * from application where name_init LIKE '%" + Name + "%'";
        Connection con = DBConnection.getConnection();
        ResultSet rst = DBHandel.getData(con, qry);
        ArrayList<DistricModel> ar = new ArrayList<DistricModel>();
        while (rst.next()) {
            String serial_no = rst.getString(1);
            String name = rst.getString(2);
            String contact = rst.getString(12);
            String email = rst.getString(15);
            String ol_result = rst.getString(17);
            String al_result = rst.getString(21);
            String al_english = rst.getString(26);
            String marks = rst.getString(38);
            String status = rst.getString(39);
            String dob = rst.getString(9);
            String address = rst.getString(10);
            String district = rst.getString(5);
            DistricModel i = new DistricModel(serial_no, name, contact, email, ol_result, al_result, al_english, marks, status, address, dob, district);
            ar.add(i);

        }
        return ar;
    }
    
    public static ArrayList<DistricModel> getPersonByDistrict(String Name) throws ClassNotFoundException, SQLException, Exception {//serch item 
        String qry = "Select * from application where distric LIKE '%" + Name + "%'";
        Connection con = DBConnection.getConnection();
        ResultSet rst = DBHandel.getData(con, qry);
        ArrayList<DistricModel> ar = new ArrayList<DistricModel>();
        while (rst.next()) {
            String serial_no = rst.getString(1);
            String name = rst.getString(2);
            String contact = rst.getString(12);
            String email = rst.getString(15);
            String ol_result = rst.getString(17);
            String al_result = rst.getString(21);
            String al_english = rst.getString(26);
            String marks = rst.getString(38);
            String status = rst.getString(39);
            String dob = rst.getString(9);
            String address = rst.getString(10);
            String district = rst.getString(5);
            DistricModel i = new DistricModel(serial_no, name, contact, email, ol_result, al_result, al_english, marks, status, address, dob, district);
            ar.add(i);

        }
        return ar;
    }
}
