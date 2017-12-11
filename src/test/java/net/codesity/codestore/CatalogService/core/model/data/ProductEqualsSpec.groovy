package net.codesity.codestore.CatalogService.core.model.data

import spock.lang.Specification

class ProductEqualsSpec extends Specification {

    def "Products with same core characteristics(id, name, desc, price, country) are equal"(){

        given:
        Product product1 = new Product(id1, "Dummy", "Dummy product", 100.0, "CN");
        Product product2 = new Product(id2, "dummy", "DummY proDuct", 100.0, "cn");

        when:
        boolean aEqualsB = product1.equals(product2)
        boolean bEqualsA = product2.equals(product1)

        then:
        aEqualsB == bEqualsA
        aEqualsB == true

        where:
        id1 | id2
        51 | 51
        10 | 10
        25| 25

    }

}
