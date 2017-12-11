package net.codesity.codestore.CatalogService.core.model.repository;

import net.codesity.codestore.CatalogService.core.model.specification.ISpecification;

import java.util.List;

public interface IRepository<T>
{
    void add(T t);

    void add(Iterable<T> itemsToAdd);

    void update(T t);

    void remove(T t);

    void remove(ISpecification specification);

    List<T> query(ISpecification specification);
    
}
