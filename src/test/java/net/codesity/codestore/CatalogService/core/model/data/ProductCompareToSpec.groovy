package net.codesity.codestore.CatalogService.core.model.data

import spock.lang.Specification

class ProductCompareToSpec extends Specification{

    def "Equal products return 0 on compareTo"(){
        given:
        Product product1 = new Product(51, "Dummy", "Dummy product", 100.0, "CN");
        Product product2 = new Product(51, "dummy", "DummY proDuct", 100.0, "cn");

        when:
        boolean equals = product1.equals(product2)
        int result = product1.compareTo(product2)

        then:
        equals == true
        int == 0
    }

    def "Product with greater id returns positive value on CompareTo"(){
        given:
        Product product1 = new Product(51, "Dummy", "Dummy product", 100.0, "CN");
        Product product2 = new Product(id, "Lorem", "ipsum dolor", 200.0, "UK");

        when:
        int result = product1.compareTo(product2)

        then:
        result > 0

        where:
        id << [60,100, 55, 1000]
    }

}
