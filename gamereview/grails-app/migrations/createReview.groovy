databaseChangeLog = {

    changeSet(author: "carol (generated)", id: "1499007082058-2") {
        createTable(tableName: "review") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "reviewPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "game_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "review_date", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "review_text", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "carol (generated)", id: "1499007082058-3") {
        addForeignKeyConstraint(baseColumnNames: "game_id", baseTableName: "review", constraintName: "FKqqxxwdsxhhxc7t2ho2acg2m4p", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "game")
    }
}
