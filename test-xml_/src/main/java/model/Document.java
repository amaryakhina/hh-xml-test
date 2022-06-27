package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(namespace = "fsa", localName = "RdcTr")
public class Document {

    @JsonProperty(value = "tns:Type")
    @JacksonXmlProperty(namespace = "tns", localName = "Type")
    private String type;

    @JsonProperty(value = "tns:Requisites")
    @JacksonXmlProperty(namespace = "tns", localName = "Requisites")
    private Requisites requisites;

    @JsonProperty(value = "tns:Applicant")
    @JacksonXmlProperty(namespace = "tns", localName = "Applicant")
    private Applicant applicant;

    @JsonProperty(value = "tns:ApplicantUl")
    @JacksonXmlProperty(namespace = "tns", localName = "ApplicantUl")
    private ApplicantUl applicantUl;

    @JsonProperty(value = "tns:ApplicantFl")
    @JacksonXmlProperty(namespace = "tns", localName = "ApplicantFl")
    private String applicantFl;

    @JsonProperty(value = "tns:ApplicantAl")
    @JacksonXmlProperty(namespace = "tns", localName = "ApplicantAl")
    private String applicantAl;

    @JsonProperty(value = "tns:ApplicantAu")
    @JacksonXmlProperty(namespace = "tns", localName = "ApplicantAu")
    private String applicantAu;

    @JsonProperty(value = "tns:Manufacturer")
    @JacksonXmlProperty(namespace = "tns", localName = "Manufacturer")
    private Manufacturer manufacturer;

    @JsonProperty(value = "tns:Product")
    @JacksonXmlProperty(namespace = "tns", localName = "Product")
    private Product product;

    @JsonProperty(value = "tns:DeclareAddInfo")
    @JacksonXmlProperty(namespace = "tns", localName = "DeclareAddInfo")
    private String declareAddInfo;

    @JsonProperty(value = "tns:CertificationOrgan")
    @JacksonXmlProperty(namespace = "tns", localName = "CertificationOrgan")
    private CertificationOrgan certificationOrgan;
}
