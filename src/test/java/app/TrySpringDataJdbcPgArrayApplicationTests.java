package app;

import app.data.Notebook;
import app.data.NotebookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TrySpringDataJdbcPgArrayApplicationTests {

    @Autowired
    private NotebookRepository notebookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsertAndQueryByArrayColumn() {
        final Notebook notebookA = notebookRepository.save(new Notebook("A", List.of("red", "green", "blue")));
        assertThat(notebookA.id()).isNotNull();
        final Notebook notebookB = notebookRepository.save(new Notebook("B", List.of("yellow", "blue")));

        List<Notebook> notebooks = notebookRepository.findByColor("blue");
        assertThat(notebooks).hasSize(2)
            .extracting(Notebook::section).containsExactlyInAnyOrder("A", "B");

        List<String> colors = notebookRepository.findDistinctColors();
        assertThat(colors).containsExactlyInAnyOrder("red", "green", "yellow", "blue");
    }
}
