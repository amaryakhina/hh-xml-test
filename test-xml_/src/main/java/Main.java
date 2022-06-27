import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import model.RootElement;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Resource fileResource = new ClassPathResource("sample.xml");
        ClassLoader classLoader = Main.class.getClassLoader();
        File yamlFile = new File(classLoader.getResource(".").getFile() + "/sample.yml");
        JacksonXmlModule module = new JacksonXmlModule();
        XmlMapper xmlMapper = new XmlMapper(module);
        RootElement rootElement = xmlMapper.readValue(fileResource.getFile(), RootElement.class);
        rootElement.getDocument().getProduct().setTechRegs(null);
        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        yamlMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        yamlMapper.writeValue(yamlFile, rootElement);
    }

}
