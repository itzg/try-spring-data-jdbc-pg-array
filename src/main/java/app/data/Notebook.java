package app.data;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table
public record Notebook(
    @Id
    Long id,
    String section,
    List<String> colors
) {
    @Builder
    public Notebook(
        String section, List<String> colors) {
        this(null, section, colors);
    }
}
