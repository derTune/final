package com.example.postCounter;
import java.util.List;
public interface CounterService {
    int getCount();
    void save();
    List<OutputModel> getAll();
}
