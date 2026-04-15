package ar.edu.unlp.info.oo2.patrones;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements Exporter {

    public JacksonAdapter() {}

    @Override
    public String exportar(List<Socio> socios) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error al exportar socios con la librería Jackson", e);
        }
    }
    
}
