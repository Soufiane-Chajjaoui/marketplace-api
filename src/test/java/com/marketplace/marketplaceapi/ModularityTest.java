package com.marketplace.marketplaceapi;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModularityTest {

    @Test
    void verifiesModularStructure() {
        ApplicationModules modules = ApplicationModules.of(MarketplaceApiApplication.class);
        modules.forEach(System.out::println); // affiche les modules détectés
        modules.verify();                      // vérifie les règles
    }
}
