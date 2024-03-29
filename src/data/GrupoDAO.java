package data;
import java.util.Collection;
import util.GrupoDTO;
import util.GrupoAssembler;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GrupoDAO extends HibernateDaoSupport {
 public boolean insert(GrupoDTO grupoDTO) {
   getHibernateTemplate().saveOrUpdate(grupoDTO);
   return true;
 }
 public boolean delete(GrupoDTO grupoDTO) {
   getHibernateTemplate().delete(grupoDTO);
   return true;
 }
 public GrupoDTO findById(int id) {
   GrupoDTO prof;
   prof = (GrupoDTO)getHibernateTemplate().get(GrupoDTO.class,new Integer(id));
   return prof;
 }
 public boolean update(GrupoDTO grupoDTO) {
   getHibernateTemplate().saveOrUpdate(grupoDTO);
   return true;
 }
 public Collection findAll() {
   return getHibernateTemplate().find("from GrupoDTO");
 }
}