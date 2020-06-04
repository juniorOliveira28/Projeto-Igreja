package dao;

import fabrica.Fabrica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Pessoa;

public class DAOGenerico<T> {

    private static EntityManager entityManager;
    private Class<T> classe;

    public DAOGenerico(Class<T> classe) {
        entityManager = Fabrica.getFabrica().getEm();
        this.classe = classe;
    }

    public T salvar(T objeto) {
        try {
            if (!entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().begin();
            }
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
        return objeto;
    }

    public T alterar(T objeto) {
        try {
            if (!entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().begin();
            }
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
        return objeto;
    }

    public boolean excluir(Long id) {
        try {
            entityManager.getTransaction().begin();
            T objeto = entityManager.find(classe, id);
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            return true;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();

        }
        return false;
    }

    public List<T> buscarTodos() {
        Query query = null;
        try {
            query = entityManager.createQuery("from " + classe.getSimpleName() + " order by nome");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return query.getResultList();
    }

    public List<Pessoa> buscarPorNome(String nome) {

        Query query = null;
        try {
            query = entityManager.createQuery("from Pessoa where nome like '" + nome + "%'");
            System.out.println("nome " + nome);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return query.getResultList();

    }
}

