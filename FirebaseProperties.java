package hello.spaproject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "firebase")
public final class FirebaseProperties {

    private final String serviceAccountkey;
    private final String storageBucket;
}
