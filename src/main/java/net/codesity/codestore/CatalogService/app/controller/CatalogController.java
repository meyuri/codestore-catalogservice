package net.codesity.codestore.CatalogService.app.controller;

import lombok.NonNull;
import net.codesity.codestore.CatalogService.core.controller.ICatalogController;
import net.codesity.codestore.CatalogService.core.model.data.Product;
import net.codesity.codestore.CatalogService.core.model.repository.IRepository;

public class CatalogController implements ICatalogController
{

    private IRepository<Product> repository;

    public CatalogController(@NonNull IRepository<Product> repository){

        this.repository = repository;

    }

}
