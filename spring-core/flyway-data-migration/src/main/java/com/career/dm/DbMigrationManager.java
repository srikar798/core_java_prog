package com.career.dm;

import org.flywaydb.core.Flyway;
import org.yaml.snakeyaml.Yaml;

public class DbMigrationManager {


    public static void main(String[] args) {

       /* Flyway flyway = Flyway.configure()
                .dataSource(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres","dbuser").load();
        flyway.migrate();*/

        migrate();
    }

    private static void migrate() {
        Yaml yaml = new Yaml();
        TenantMaster tenantMaster = yaml.loadAs(DbMigrationManager.class.getResourceAsStream("/tenant_db.yaml"), TenantMaster.class);
        tenantMaster.getTenants().forEach(tenantDetails -> {
                    System.out.println("Migrating for tenant :" + tenantDetails.getName());
                    Flyway flyway = Flyway.configure()
                            .dataSource(
                                    tenantDetails.getDb().getUrl(),
                                    tenantDetails.getDb().getUsername(),
                                    tenantDetails.getDb().getPassword())
                            .load();
                    flyway.migrate();
                }
                    );

    }
}
