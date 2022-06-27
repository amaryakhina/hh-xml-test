package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CertificationOrgan {

    @JsonProperty(value = "tns:FullName")
    @JacksonXmlProperty(namespace = "tns", localName = "FullName")
    private String fullName;

    @JsonProperty(value = "tns:Number")
    @JacksonXmlProperty(namespace = "tns", localName = "Number")
    private String number;

    @JsonProperty(value = "tns:DateReg")
    @JacksonXmlProperty(namespace = "tns", localName = "DateReg")
    private String dateReg;

    @JsonProperty(value = "tns:Organ")
    @JacksonXmlProperty(namespace = "tns", localName = "Organ")
    private String organ;

    @JsonProperty(value = "tns:Head")
    @JacksonXmlProperty(namespace = "tns", localName = "Head")
    private String head;

    @JsonProperty(value = "tns:AddressLegal")
    @JacksonXmlProperty(namespace = "tns", localName = "AddressLegal")
    private String addressLegal;

    @JsonProperty(value = "tns:Address")
    @JacksonXmlProperty(namespace = "tns", localName = "Address")
    private String address;

    @JsonProperty(value = "tns:Phone")
    @JacksonXmlProperty(namespace = "tns", localName = "Phone")
    private String phone;

    @JsonProperty(value = "tns:Fax")
    @JacksonXmlProperty(namespace = "tns", localName = "Fax")
    private String fax;

    @JsonProperty(value = "tns:Email")
    @JacksonXmlProperty(namespace = "tns", localName = "Email")
    private String email;

    @JsonProperty(value = "tns:Ogrn")
    @JacksonXmlProperty(namespace = "tns", localName = "Ogrn")
    private String ogrn;

    @JsonProperty(value = "tns:Experts")
    @JacksonXmlProperty(namespace = "tns", localName = "Experts")
    private Experts experts;

    @Data
    private static class Experts {

        @JsonProperty(value = "tns:Surname")
        @JacksonXmlProperty(namespace = "tns", localName = "Surname")
        private String surname;

        @JsonProperty(value = "tns:Name")
        @JacksonXmlProperty(namespace = "tns", localName = "Name")
        private String name;

        @JsonProperty(value = "tns:Patronymic")
        @JacksonXmlProperty(namespace = "tns", localName = "Patronymic")
        private String patronymic;
    }

}
