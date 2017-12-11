package net.codesity.codestore.CatalogService.app.model.client;

import lombok.NonNull;
import net.codesity.codestore.CatalogService.core.model.client.ISqlClient;

import java.sql.Connection;

public class MySqlClient implements ISqlClient
{
    private String url;

    public MySqlClient(@NonNull String url){
        this.url = url;
    }

    @Override
    public Connection getSqlConnection()
    {
        return null;
    }
}
