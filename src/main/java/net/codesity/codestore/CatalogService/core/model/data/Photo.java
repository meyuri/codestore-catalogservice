package net.codesity.codestore.CatalogService.core.model.data;

import lombok.Getter;
import lombok.Setter;

public class Photo
{
    @Getter @Setter private int id;
    @Getter @Setter private String url;
    @Getter @Setter private String alt;
}
