package org.example.kotlinCode.interpreter.SQL

fun select(columns: String, from: SelectClause.() -> Unit) : SelectClause {
    return SelectClause(columns).apply(from)
}

val sql = select("name, age") {from("users") {where("age > 25")} }

class SelectClause(private val columns: String) {
    private lateinit var from: FromClause

    fun from(
        table: String,
        where: FromClause.() -> Unit
    ) : FromClause {
        this.from = FromClause(table)
        return this.from.apply(where)
    }

    override fun toString(): String {
        return "SELECT $columns $from"
    }
}

class FromClause(private val table: String) {
    private lateinit var where: WhereClause

    fun where(conditions: String) = this.apply {
        where = WhereClause(conditions)
    }

    override fun toString(): String {
        return "FROM $table $where"
    }
}

class WhereClause(private val conditions: String) {
    override fun toString(): String {
        return "WHERE $conditions"
    }
}




fun main() {
    println(sql)
}