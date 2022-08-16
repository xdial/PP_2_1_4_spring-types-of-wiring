package koschei.models;

import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    @Qualifier("getIsland")
    private Island2 island;

    @Override
    public String toString() {

        return "на океане остров " + island.toString();
    }
}
