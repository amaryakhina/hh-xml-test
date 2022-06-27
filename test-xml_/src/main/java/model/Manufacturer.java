package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Manufacturer {

    @JsonProperty(value = "tns:Type")
    @JacksonXmlProperty(namespace = "tns", localName = "Type")
    private String type;

    @JsonProperty(value = "tns:ManufacturerUl")
    @JacksonXmlProperty(namespace = "tns", localName = "ManufacturerUl")
    private ManufacturerUl manufacturerUl;

    @JsonProperty(value = "tns:ManufacturerAl")
    @JacksonXmlProperty(namespace = "tns", localName = "ManufacturerAl")
    private Object manufacturerAl;

    @JsonProperty(value = "tns:ManufacturerFl")
    @JacksonXmlProperty(namespace = "tns", localName = "ManufacturerFl")
    private Object manufacturerFl;

    @Data
    private static class ManufacturerUl {

        @JsonProperty(value = "tns:OrganForm")
        @JacksonXmlProperty(namespace = "tns", localName = "OrganForm")
        private String organForm;

        @JsonProperty(value = "tns:FullName")
        @JacksonXmlProperty(namespace = "tns", localName = "FullName")
        private String shortName;

        @JsonProperty(value = "tns:Address")
        @JacksonXmlProperty(namespace = "tns", localName = "Address")
        private Address address;

        @JsonProperty(value = "tns:AddressActual")
        @JacksonXmlProperty(namespace = "tns", localName = "AddressActual")
        private String addressActual;

        @JsonProperty(value = "tns:Phone")
        @JacksonXmlProperty(namespace = "tns", localName = "Phone")
        private String phone;

        @JsonProperty(value = "tns:Fax")
        @JacksonXmlProperty(namespace = "tns", localName = "Fax")
        private String fax;

        @JsonProperty(value = "tns:Email")
        @JacksonXmlProperty(namespace = "tns", localName = "Email")
        private String email;

        @JsonProperty(value = "tns:Organ")
        @JacksonXmlProperty(namespace = "tns", localName = "Organ")
        private String organ;

        @JsonProperty(value = "tns:Date")
        @JacksonXmlProperty(namespace = "tns", localName = "Date")
        private String date;

        @JsonProperty(value = "tns:Ogrn")
        @JacksonXmlProperty(namespace = "tns", localName = "Ogrn")
        private String ogrn;

        @JsonProperty(value = "tns:Inn")
        @JacksonXmlProperty(namespace = "tns", localName = "Inn")
        private String inn;
    }

}
