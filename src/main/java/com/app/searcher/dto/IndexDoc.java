package com.app.searcher.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class IndexDoc {
    public String word;
    public List<Long> references;

    public IndexDoc(String word, List<Long> references) {
        this.word = word;
        this.references = references;
    }
}
