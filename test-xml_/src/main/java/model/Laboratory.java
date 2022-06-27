package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Laboratory {

    @JsonProperty(value = "tns:NumberReg")
    @JacksonXmlProperty(namespace = "tns", localName = "NumberReg")
    private String numberReg;

    @JsonProperty(value = "tns:Name")
    @JacksonXmlProperty(namespace = "tns", localName = "Name")
    private String name;

    @JsonProperty(value = "tns:DateReg")
    @JacksonXmlProperty(namespace = "tns", localName = "DateReg")
    private String dateReg;

    @JsonProperty(value = "tns:DateExpiry")
    @JacksonXmlProperty(namespace = "tns", localName = "DateExpiry")
    private String dateExpiry;

    @JsonProperty(value = "tns:Document")
    @JacksonXmlProperty(namespace = "tns", localName = "Document")
    private Object document;

    @JsonProperty(value = "tns:Info")
    @JacksonXmlProperty(namespace = "tns", localName = "Info")
    private Object info;
}
