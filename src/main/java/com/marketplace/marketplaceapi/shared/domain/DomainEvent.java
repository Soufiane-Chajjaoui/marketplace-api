package com.marketplace.marketplaceapi.shared.domain;

import java.time.LocalDateTime;

public interface DomainEvent {
    LocalDateTime occurredAt();
}