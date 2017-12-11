package net.codesity.codestore.CatalogService.core.model.client;

import java.sql.Connection;

public interface ISqlClient
{

    Connection getSqlConnection();

}
