package com.marketplace.marketplaceapi.shared.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ResourceNotFoundExceptionTest {
    private final ResourceNotFoundException exception = new ResourceNotFoundException("Order", 42L);

    @Test
    void getMessage_shouldReturnCorrectMessage() {
        assertThatThrownBy(() -> { throw exception;})
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage("Order not found with id: 42");
    }

}