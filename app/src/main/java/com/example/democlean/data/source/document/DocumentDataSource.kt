package com.example.democlean.data.source.document

import com.example.democlean.data.mappers.document.toDocument
import com.example.democlean.data.models.document.DocumentResponse
import com.example.democlean.domain.models.document.Document

class DocumentDataSource {

    fun getDocument(): Document {

        val data = DocumentResponse(
            guiId = "3wrwefsfsff",
            nameDoc = "unknown",
            detailDoc = "here data updated",
            dateCreatedDoc = "09/02/2022",
        )
        return data.toDocument()
    }
}