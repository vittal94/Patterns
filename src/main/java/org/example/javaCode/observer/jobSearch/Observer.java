package org.example.javaCode.observer.jobSearch;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
