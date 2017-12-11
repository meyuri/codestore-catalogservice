package net.codesity.codestore.CatalogService.app.model.client

import net.codesity.codestore.CatalogService.core.model.client.ISqlClient
import spock.lang.Specification

class MySqlClientSpec extends Specification {

    String url = "jdbc:mysql://localhost/test?user=test&password=test"

    def "MySqlClient returns correct Connection object with correct url"(){

        given:
        ISqlClient sqlClient = new MySqlClient(url)

        when:
        String result = sqlClient.getSqlConnection().getMetaData().getURL()

        then:
        url == result

    }

}
