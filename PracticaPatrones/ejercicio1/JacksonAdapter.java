package io.github.unlp_oo.archetype;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonAdapter extends VoorheesExporter {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String exportar(List<Socio> socios) {
        try {
            return mapper.writeValueAsString(socios);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
