package admin.firestore

import kotlin.js.Promise

/**
 * A CollectionReference object can be used for adding documents, getting document references, and querying for documents (using the methods inherited from Query).
 * @see <a href="https://cloud.google.com/nodejs/docs/reference/firestore/0.10.x/CollectionReference">CollectionReference</a>
 */
external interface CollectionReference {
    val firestore: Firestore
    val id: String
    val parent: DocumentReference?
    fun add(data: DocumentData): Promise<DocumentData>
    fun doc(documentPath: String): DocumentReference
    fun get(): Promise<QuerySnapshot>
}