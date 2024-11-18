package ua.ucu.edu.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CachedDocument implements Document {
    private Document document;

    public String getGcsPath() {
        return document.getGcsPath();
    }

    public String parse() {
        String cached = DBConnection.getInstance().getDocument(document.getGcsPath());
        if (cached != null) {
            return cached;
        } else {
            String parsed = document.parse();
            DBConnection.getInstance().createDocument(getGcsPath(), parsed);
            return parsed;
        }
    }
}