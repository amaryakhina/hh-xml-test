package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Requisites {
    @JsonProperty(value = "tns:Status")
    @JacksonXmlProperty(namespace = "tns", localName = "Status")
    private String status;

    @JsonProperty(value = "tns:Section")
    @JacksonXmlProperty(namespace = "tns", localName = "Section")
    private String section;

    @JsonProperty(value = "tns:Number")
    @JacksonXmlProperty(namespace = "tns", localName = "Number")
    private String number;

    @JsonProperty(value = "tns:DateReg")
    @JacksonXmlProperty(namespace = "tns", localName = "DateReg")
    private String dateReg;

    @JsonProperty(value = "tns:DateExpiry")
    @JacksonXmlProperty(namespace = "tns", localName = "DateExpiry")
    private String dateExpiry;

    @JsonProperty(value = "tns:NoExpiry")
    @JacksonXmlProperty(namespace = "tns", localName = "NoExpiry")
    private Object noExpiry;

    @JsonProperty(value = "tns:BaseDeclaration")
    @JacksonXmlProperty(namespace = "tns", localName = "BaseDeclaration")
    private BaseDeclaration baseDeclaration;

    @JsonProperty(value = "tns:Discontinued")
    @JacksonXmlProperty(namespace = "tns", localName = "Discontinued")
    private Object discontinued;
}
