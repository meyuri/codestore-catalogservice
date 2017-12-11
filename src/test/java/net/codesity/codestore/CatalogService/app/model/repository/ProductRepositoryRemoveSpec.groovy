package net.codesity.codestore.CatalogService.app.model.repository

import net.codesity.codestore.CatalogService.core.model.client.ISqlClient
import net.codesity.codestore.CatalogService.core.model.data.Product
import net.codesity.codestore.CatalogService.core.model.repository.IRepository
import net.codesity.codestore.CatalogService.core.model.specification.ISpecification
import spock.lang.Specification

class ProductRepositoryRemoveSpec extends Specification {

    IRepository<Product> repository
    ISqlClient mockSqlClient
    ISpecification mockSpec

    def setup(){
        mockSqlClient = Stub(ISqlClient.class)
        mockSqlClient.getSqlConnection() >> new FakeConnection()

        repository = new ProductRepository(mockSqlClient)
    }

    def "Remove object by specification requires to call toQuery()"(){

        given:
        mockSpec = Stub(ISpecification.class)
        mockSpec.toQuery()>>"Hello"

        when:
        repository.remove(mockSpec)

        then:
        1*mockSpec.toQuery()

    }

}
