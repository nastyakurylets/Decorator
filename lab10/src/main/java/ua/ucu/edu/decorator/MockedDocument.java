package ua.ucu.edu.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MockedDocument implements Document {
    public String gcsPath;

    public String parse() {
        return "Mocked text result";
    }
}