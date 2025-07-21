import java.util.logging.LogManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.LogWriter;

@Configuration
public class AppConfig {

    @Bean
    public LogWriter fileLogWriter() {
      
        return new FileLogginWriter("app.log");
    }

    @Bean
    public LogManager logManager() {
        LogManager mgr = new LogManager();
       
        mgr.setLogWriter(fileLogWriter());
        return mgr;
    }
}
