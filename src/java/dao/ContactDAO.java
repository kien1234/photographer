/*
* ArticalDAO.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;

/**
 * ContactDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getContact
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class ContactDAO {

    /**
     * getContact.<br>
     *
     * Lấy contact trong database
     *
     * @return a contact
     * @throws SQLException
     */
    public Contact getContact() throws SQLException {
        Contact c = new Contact();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT TOP(1) [id]\n");
            sql.append(",[address]\n");
            sql.append(",[city]\n");
            sql.append(",[country]\n");
            sql.append(",[tel]\n");
            sql.append(",[email]\n");
            sql.append(",[about_me]\n");
            sql.append("FROM [dbo].[Contact]");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setAddress(rs.getString("address"));
                c.setCity(rs.getString("city"));
                c.setCountry(rs.getString("country"));
                c.setTel(rs.getString("tel"));
                c.setEmail(rs.getString("email"));
                c.setAboutMe(rs.getString("about_me"));
            }
        } catch (Exception ex) {
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return c;
    }
}
