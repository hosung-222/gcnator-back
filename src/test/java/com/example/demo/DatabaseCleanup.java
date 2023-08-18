//package com.example.demo;
//
//import org.hibernate.type.EntityType;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
public class DatabaseCleanup {
//    @PersistenceContext
//    private EntityManager entityManager;
//    private List<String> tableNames;
//
//    @Override
//    public void afterPropertiesSet() {
//        final Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
//        tableNames = entities.stream()
//    }
//
//    @Transactional
//    public void execute() {
//        entityManager.flush();
//        entityManager.createNamedQuery("SET REFERENTIAL_INTEGRITY FALSE").executeUpdate();
//
//        for(final String tableName : tableNames) {
//            entityManager.createNamedQuery("TRUNCATE TABLE " + tableName).executeUpdate();
//            entityManager.createNamedQuery("ALTER TABLE " + tableName + " ALTER COLUMN ID RESTART WITH !").executeUpdate();
//        }
//
//        entityManager.createNamedQuery("SET REFERENTIAL_INTEGRITY TRUE").executeUpdate();
//    }
}
