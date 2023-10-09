package ru.netology.sqldz3ver2.Service;

import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private Repository repository;

    protected List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
