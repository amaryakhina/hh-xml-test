package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BaseDeclaration {

    @JsonProperty(value = "tns:Documents")
    @JacksonXmlProperty(namespace = "tns", localName = "Documents")
    private String documents;

    @JsonProperty(value = "tns:Schema")
    @JacksonXmlProperty(namespace = "tns", localName = "Schema")
    private String schema;

    @JsonProperty(value = "tns:Base")
    @JacksonXmlProperty(namespace = "tns", localName = "Base")
    private Base base;

    @JsonProperty(value = "tns:Laboratory")
    @JacksonXmlProperty(namespace = "tns", localName = "Laboratory")
    private Laboratory laboratory;

    @Data
    private static class Base{

        @JsonProperty(value = "tns:string")
        @JacksonXmlProperty(namespace = "tns", localName = "string")
        private String baseString;
    }
}
