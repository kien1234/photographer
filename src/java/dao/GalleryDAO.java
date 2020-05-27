/*
* GalleryDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Gallery;

/**
 * GalleryDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * .getGalleries.
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class GalleryDAO {

    /**
     * getGalleries.<br>
     *
     * Lất tất cả Gallery từ database và lưu vào 1 list
     *
     * @return a list of Gallery
     * @throws SQLException
     */
    public List<Gallery> getGalleries() throws SQLException {
        List<Gallery> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT [id]\n");
            sql.append(",[name]\n");
            sql.append(",[mainPicture]\n");
            sql.append(",[description]\n");
            sql.append("FROM [dbo].[Gallery]");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                Gallery g = new Gallery();
                g.setId(rs.getInt("id"));
                g.setName(rs.getString("name"));
                g.setMainPicture(rs.getString("mainPicture"));
                g.setDescription(rs.getString("description"));
                list.add(g);
            }
        } catch (Exception ex) {
            Logger.getLogger(GalleryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return list;
    }
}
