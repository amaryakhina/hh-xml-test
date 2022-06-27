package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

@Data
public class Product {
    @JsonProperty(value = "tns:DeclareType")
    @JacksonXmlProperty(namespace = "tns", localName = "DeclareType")
    private String declareType;

    @JsonProperty(value = "tns:DcOriginType")
    @JacksonXmlProperty(namespace = "tns", localName = "DcOriginType")
    private String dcOriginType;

    @JsonProperty(value = "tns:Name")
    @JacksonXmlProperty(namespace = "tns", localName = "Name")
    private String name;

    @JsonProperty(value = "tns:ProductInfo")
    @JacksonXmlProperty(namespace = "tns", localName = "ProductInfo")
    private String productInfo;

    @JsonProperty(value = "tns:Okp")
    @JacksonXmlProperty(namespace = "tns", localName = "Okp")
    private String okp;

    @JsonProperty(value = "tns:OkpdText")
    @JacksonXmlProperty(namespace = "tns", localName = "OkpdText")
    private String okpdText;

    @JsonProperty(value = "tns:Standart")
    @JacksonXmlProperty(namespace = "tns", localName = "Standart")
    private String standart;

    @JsonProperty(value = "tns:SizeNumber")
    @JacksonXmlProperty(namespace = "tns", localName = "SizeNumber")
    private String sizeNumber;

    @JsonProperty(value = "tns:DetailsShippingDocumentation")
    @JacksonXmlProperty(namespace = "tns", localName = "DetailsShippingDocumentation")
    private String detailsShippingDocumentation;

    @JsonProperty(value = "tns:ContractInfo")
    @JacksonXmlProperty(namespace = "tns", localName = "ContractInfo")
    private String contractInfo;

    @JsonProperty(value = "tns:Info")
    @JacksonXmlProperty(namespace = "tns", localName = "Info")
    private String info;

    @JsonProperty(value = "tns:PlaceMark")
    @JacksonXmlProperty(namespace = "tns", localName = "PlaceMark")
    private String placeMark;

    @JsonProperty(value = "tns:TechRegs")
    @JacksonXmlProperty(namespace = "tns", localName = "TechRegs")
    private TechRegs techRegs;

    @Data
    private static class TechRegs {
        @JsonProperty(value = "tns:TechReg")
        @JacksonXmlProperty(namespace = "tns", localName = "TechReg")
        private String techReg;

        @JsonProperty(value = "tns:TechRegInfo")
        @JacksonXmlProperty(namespace = "tns", localName = "TechRegInfo")
        private String techRegInfo;
    }
}
