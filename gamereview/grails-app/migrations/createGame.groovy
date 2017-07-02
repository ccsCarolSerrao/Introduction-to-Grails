databaseChangeLog = {

    changeSet(author: "carol (generated)", id: "1498998412535-1") {
        createTable(tableName: "game") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "gamePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "DOUBLE") {
                constraints(nullable: "false")
            }
        }
    }
}
