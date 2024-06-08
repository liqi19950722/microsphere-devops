package io.github.microsphere.devops.metadata;

import org.gradle.api.artifacts.CacheableRule;
import org.gradle.api.artifacts.ComponentMetadataContext;
import org.gradle.api.artifacts.ComponentMetadataDetails;
import org.gradle.api.artifacts.ComponentMetadataRule;

@CacheableRule
public class Slf4JImplRule implements ComponentMetadataRule {

    @Override
    public void execute(ComponentMetadataContext componentMetadataContext) {
        ComponentMetadataDetails details = componentMetadataContext.getDetails();
        String version = details.getId().getVersion();
        details.allVariants(variant ->
                variant.withCapabilities(capabilities ->
                        capabilities.addCapability("org.slf4j", "slf4j-impl", version))
        );
    }
}
