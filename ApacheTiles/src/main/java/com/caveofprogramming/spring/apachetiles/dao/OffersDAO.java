package com.caveofprogramming.spring.apachetiles.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by anton on 12/12/2016.
 */

@Repository
public class OffersDAO {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc){
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public List<Offer> getOffers(){
        return jdbc.query("select * from offers", new RowMapper<Offer>() {
            public Offer mapRow(ResultSet rs, int i) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setEmail(rs.getString("email"));
                offer.setName(rs.getString("name"));
                offer.setText(rs.getString("text"));

                return offer;
            }
        });
    }


    public boolean createOffer(Offer offer){
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(offer);
        return jdbc.update("insert into offers(name,email, text) values(:name, :email, :text)", param ) == 1;
    }

    public boolean deleteOffer(int id){
        MapSqlParameterSource param = new MapSqlParameterSource("id", id);
        return jdbc.update("delete from offers where id = :id", param) == 1;
    }

    public Offer getOffer(int id ) {

        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("id", id);
        return jdbc.queryForObject("select * from offers where id = :id", param, new RowMapper<Offer>() {
            public Offer mapRow(ResultSet rs, int i) throws SQLException {
                Offer offer = new Offer();
                offer.setName(rs.getString("name"));
                offer.setEmail(rs.getString(("email")));
                offer.setText(rs.getString("text"));
                offer.setId(rs.getInt("id"));
                return offer;
            }
        });
    }
}
