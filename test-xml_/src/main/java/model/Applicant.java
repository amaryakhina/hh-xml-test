package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Applicant {

    @JsonProperty(value = "tns:ApplicantType")
    @JacksonXmlProperty(namespace = "tns", localName = "ApplicantType")
    private String applicantType;

    @JsonProperty(value = "tns:DeclarantType")
    @JacksonXmlProperty(namespace = "tns", localName = "DeclarantType")
    private String declarantType;
}
