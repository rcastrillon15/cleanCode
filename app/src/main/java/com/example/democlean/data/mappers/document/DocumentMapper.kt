package com.example.democlean.data.mappers.document

import com.example.democlean.data.models.document.DocumentResponse
import com.example.democlean.domain.models.document.Document

fun DocumentResponse.toDocument() = Document(
    id = guiId,
    name = nameDoc,
    detail = detailDoc,
    dateCreated = dateCreatedDoc
)