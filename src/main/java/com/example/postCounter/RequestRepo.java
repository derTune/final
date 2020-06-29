package com.example.postCounter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RequestRepo extends JpaRepository<GetRequest, Long> {
    @Query(value = "select new com.example.postCounter.OutputModel(g.date, g.request)" +
            "from GetRequest g")
    List<OutputModel> getGetRequests();
}
