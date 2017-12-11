package net.codesity.codestore.CatalogService.app.model.repository

import net.codesity.codestore.CatalogService.core.model.client.ISqlClient
import net.codesity.codestore.CatalogService.core.model.data.Product
import net.codesity.codestore.CatalogService.core.model.repository.IRepository
import spock.lang.Specification

class ProductRepositoryAddSpec extends Specification {

    IRepository<Product> repository
    ISqlClient mockSqlClient

    def setup(){
        mockSqlClient = Stub(ISqlClient.class)
        mockSqlClient.getSqlConnection() >> new FakeConnection()
        repository = new ProductRepository(mockSqlClient)
    }

    def "Adding a new product requires calling a SqlClient"(){

        given:
        Product product = new Product()

        when:
        repository.add(product)

        then:
        1*mockSqlClient.getSqlConnection()
    }

    def "When group of products is added, ProductRepository.add() is calling for each product"(){

        given:
        List<Product> products = Arrays.asList(new Product(), new Product(), new Product(), new Product())

        when:
        repository.add(products)

        then:
        4*repository.add(Product)

    }

}
