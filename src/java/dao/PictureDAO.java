/*
* PictureDAO.java
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
import model.Picture;

/**
 * PictureDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * .getPicturesByGalleryId
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class PictureDAO {

    /**
     * getPicturesByGalleryId.<br>
     *
     * Lấy tất cả image theo id của Gallery từ database
     *
     * @param id
     * @return a list of Gallery
     * @throws SQLException
     */
    public List<Picture> getPicturesByGalleryId(int id) throws SQLException {
        List<Picture> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT        Picture.id, Picture.picture\n");
            sql.append("FROM            Gallery INNER JOIN\n");
            sql.append("                         Gallery_Picture ON Gallery.id = Gallery_Picture.galleryId INNER JOIN\n");
            sql.append("                         Picture ON Gallery_Picture.pictureId = Picture.id\n");
            sql.append("WHERE Gallery.id = ?;\n");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Picture p = new Picture();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("picture"));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(PictureDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return list;
    }
}
