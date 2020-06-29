package com.example.postCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CounterServiceImpl implements CounterService {
    @Autowired
    private CounterRepo counterRepo;
    @Autowired
    private RequestRepo requestRepo;

    @Override
    public int getCount() {
        GetRequest g = GetRequest.builder()
                .date(new Date())
                .request("GET")
                .build();
        requestRepo.save(g);
        return counterRepo.getCount();
    }

    @Override
    public void save() {
        Counter c = Counter.builder()
                .date(new Date())
                .request("POST")
                .build();
        counterRepo.save(c);
    }

    @Override
    public List<OutputModel> getAll() {
        List<OutputModel> list = new ArrayList<>();
        list.addAll(requestRepo.getGetRequests());
        list.addAll(counterRepo.getCounters());
        return list;
    }

}
