package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ApplicantUl {

    @JsonProperty(value = "tns:OrganForm")
    @JacksonXmlProperty(namespace = "tns", localName = "OrganForm")
    private String organForm;

    @JsonProperty(value = "tns:FullName")
    @JacksonXmlProperty(namespace = "tns", localName = "FullName")
    private String fullName;

    @JsonProperty(value = "tns:ShortName")
    @JacksonXmlProperty(namespace = "tns", localName = "ShortName")
    private Object shortName;

    @JsonProperty(value = "tns:Head")
    @JacksonXmlProperty(namespace = "tns", localName = "Head")
    private String head;

    @JsonProperty(value = "tns:HeadPost")
    @JacksonXmlProperty(namespace = "tns", localName = "HeadPost")
    private String headPost;

    @JsonProperty(value = "tns:HeadText")
    @JacksonXmlProperty(namespace = "tns", localName = "HeadText")
    private String headText;

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

    @JsonProperty(value = "tns:RegInfo")
    @JacksonXmlProperty(namespace = "tns", localName = "RegInfo")
    private String regInfo;

    @JsonProperty(value = "tns:Contract")
    @JacksonXmlProperty(namespace = "tns", localName = "Contract")
    private String contract;
}
