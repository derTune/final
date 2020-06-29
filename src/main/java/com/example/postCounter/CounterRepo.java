package com.example.postCounter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CounterRepo extends JpaRepository<Counter, Long> {
    @Query(value = "select count(c.id) from counter c", nativeQuery = true)
    int getCount();
    @Query(value = "select new com.example.postCounter.OutputModel(c.date, c.request)" +
            "from Counter c")
    List<OutputModel> getCounters();
}
