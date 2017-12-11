package net.codesity.codestore.CatalogService.app.model.repository;

import lombok.NonNull;
import net.codesity.codestore.CatalogService.core.model.client.ISqlClient;
import net.codesity.codestore.CatalogService.core.model.data.Product;
import net.codesity.codestore.CatalogService.core.model.repository.IRepository;
import net.codesity.codestore.CatalogService.core.model.specification.ISpecification;

import java.util.List;

public class ProductRepository implements IRepository<Product>
{

    private ISqlClient sqlClient;

    public ProductRepository(@NonNull ISqlClient sqlClient){
        this.sqlClient = sqlClient;
    }

    @Override
    public void add(Product product)
    {

    }

    @Override
    public void add(Iterable<Product> itemsToAdd)
    {

    }

    @Override
    public void update(Product product)
    {

    }

    @Override
    public void remove(Product product)
    {

    }

    @Override
    public void remove(ISpecification specification)
    {

    }

    @Override
    public List<Product> query(ISpecification specification)
    {
        return null;
    }
}
