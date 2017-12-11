package net.codesity.codestore.CatalogService.app.model.specification;

import lombok.NonNull;
import net.codesity.codestore.CatalogService.core.model.specification.ISpecification;

public class PriceRangeSpecification implements ISpecification
{

    private double from;
    private double to;

    public PriceRangeSpecification(@NonNull double from, @NonNull double to){
        this.from = from;
        this.to = to;
    }


    @Override
    public String toQuery()
    {
        return null;
    }
}
