/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.controller;

import com.jsm.my.manager.dao.HibernateUtil;
import com.jsm.my.manager.model.TelefoneUtilVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author moises
 */
public class TelefoneUtilController implements Serializable, Controller {

    public TelefoneUtilController() {
    }

    @Override
    public int save(Object object) {
        int res = 0;
        /*
        TelefoneUtilVO tuvo = (TelefoneUtilVO)object;
        DAOHelper dao = new DAOHelper();
        System.out.println(tuvo.insertInto());
        res = dao.execSql(tuvo.insertInto());
        dao.closeDb();*/
 /*EntityManager entityManager = JpaUtil.getEntityManager();
        try {

            entityManager.getTransaction().begin();

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }*/

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        ((TelefoneUtilVO) object).setDataAtualizacao(Calendar.getInstance().getTimeInMillis());
        ((TelefoneUtilVO) object).setDataRegistro(Calendar.getInstance().getTimeInMillis());
        try {
            session.getTransaction().begin();
            session.save(object);
            session.getTransaction().commit();
            res = 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }

        return res;
    }

    @Override
    public int update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getByObjectId(String objectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        List<TelefoneUtilVO> telefones = new ArrayList<>();
        /*
        DAOHelper dao = new DAOHelper();
        Statement stm = dao.getStm();
        ResultSet rs;
        try {
            stm.execute(TelefoneUtilVO.SELECT_ALL());
            rs = stm.getResultSet();
            while (rs.next()) {
                TelefoneUtilVO vo = new TelefoneUtilVO();

                vo.setDdd(rs.getString(TelefoneUtilVO.COLUMN_DDD));
                vo.setDescricao(rs.getString(TelefoneUtilVO.COLUMN_DESCRICAO));
                vo.setKeyword(rs.getString(TelefoneUtilVO.COLUMN_KEYWORD));
                vo.setObjectId(UUID.fromString(rs.getString(TelefoneUtilVO.COLUMN_OBJECT_ID)));
                vo.setTelefone(rs.getString(TelefoneUtilVO.COLUMN_TELEFONE));

                telefones.add(vo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneUtilController.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            session.getTransaction().begin();
            Criteria cri = session.createCriteria(TelefoneUtilVO.class);
            telefones = cri.list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session.isOpen()) {
                session.close();
            }

        }

        return telefones;
    }

}
