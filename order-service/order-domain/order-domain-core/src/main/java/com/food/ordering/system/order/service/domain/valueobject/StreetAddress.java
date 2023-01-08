package com.food.ordering.system.order.service.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String postCode;
    private final String city;

    public StreetAddress(final UUID id, final String street, final String postCode,
        final String city) {
        this.id = id;
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StreetAddress that = (StreetAddress) o;
        return Objects.equals(street, that.street) && Objects.equals(postCode,
            that.postCode) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postCode, city);
    }
}
