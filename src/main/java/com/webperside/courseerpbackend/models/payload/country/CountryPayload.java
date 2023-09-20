package com.webperside.courseerpbackend.models.payload.country;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Data
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryPayload {
    Long id;
    String name;
}
