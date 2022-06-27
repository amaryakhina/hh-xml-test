package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Address {

    @JsonProperty(value = "tns:string")
    @JacksonXmlProperty(namespace = "tns", localName = "string")
    private String address;
}
