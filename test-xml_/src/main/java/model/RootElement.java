package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonRootName(value = "fsa:ResponseFsaType")
@JacksonXmlRootElement(namespace = "fsa", localName = "ResponseFsaType")
public class RootElement {
    @JsonProperty(value = "fsa:RdcTr")
    @JacksonXmlProperty(namespace = "fsa", localName = "RdcTr")
    private Document document;
}
