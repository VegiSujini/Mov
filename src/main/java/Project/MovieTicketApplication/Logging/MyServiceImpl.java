package Project.MovieTicketApplication.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.CommonsRequestLoggingFilter;


@Service
public class MyServiceImpl implements MyService {
    //Logging of exception information

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        return loggingFilter;
    }
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyServiceImpl.class);
    @Override public void doStuff(final String value) {
        LOGGER.trace("Movie ticket application needed more information - {}", value);
        LOGGER.debug("Movie ticket application needed to debug - {}", value);
        LOGGER.info("Movie ticket application took input - {}", value);
        LOGGER.warn("Movie ticket application needed to warn - {}", value);
        LOGGER.error("Movie ticket application encountered an error with value - {}", value);
    }
}