package net.codesity.codestore.CatalogService.core.model.data

import spock.lang.Specification

class ProductHashCodeSpec extends Specification {

    def "Equal objects must return SAME hashcode"(){
        given:
        Product product1 = new Product(51, "Dummy", "Dummy product", 100.0, "CN");
        Product product2 = new Product(51, "dummy", "DummY proDuct", 100.0, "cn");

        expect:
        product1.hashCode() == product2.hashCode()
    }


}
