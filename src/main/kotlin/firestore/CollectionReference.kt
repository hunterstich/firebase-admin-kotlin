package firestore

import kotlin.js.Promise

external interface CollectionReference {
    val firestore: Firestore
    val id: String
    val parent: DocumentReference?
    fun add(data: DocumentData): Promise<DocumentData>
    fun doc(documentPath: String): DocumentReference
    fun get(): Promise<QuerySnapshot>
}