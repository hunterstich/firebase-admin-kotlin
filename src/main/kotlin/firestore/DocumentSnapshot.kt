package firestore

external interface DocumentSnapshot {
    val createTime: String
    val exists: Boolean
    val id: String
    val readTime: String
    val ref: DocumentReference
    val updateTime: String
    fun <T> data(): T
    fun get(field: String): Any
}