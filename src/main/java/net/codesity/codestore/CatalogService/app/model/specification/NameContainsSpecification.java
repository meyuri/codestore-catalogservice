package net.codesity.codestore.CatalogService.app.model.specification;

import lombok.NonNull;
import net.codesity.codestore.CatalogService.core.model.specification.ISpecification;

public class NameContainsSpecification implements ISpecification
{

    private String nameContains;

    public NameContainsSpecification(@NonNull String nameContains){

        this.nameContains = nameContains;

    }

    @Override
    public String toQuery()
    {
        return null;
    }
}
