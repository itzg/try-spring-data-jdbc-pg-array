package app.data;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NotebookRepository extends CrudRepository<Notebook, Long> {
    @Query("SELECT * FROM notebook WHERE :color = ANY(colors)")
    List<Notebook> findByColor(String color);

    @Query("SELECT DISTINCT unnest(colors) FROM notebook")
    List<String> findDistinctColors();
}
