package com.marketplace.marketplaceapi.shared.exception;

import com.marketplace.marketplaceapi.shared.web.ApiResponse;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class GlobalExceptionHandlerTest {

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @Test
    void handleNotFound_shouldReturnErrorResponse() {
        var ex = new ResourceNotFoundException("Product", 1L);
        ApiResponse<Void> response = handler.handleNotFound(ex);

        assertThat(response.success()).isFalse();
        assertThat(response.message()).contains("Product");
    }

    @Test
    void handleBusiness_shouldReturnErrorResponse() {
        var ex = new BusinessException("invalid state");
        ApiResponse<Void> response = handler.handleBusiness(ex);

        assertThat(response.success()).isFalse();
        assertThat(response.message()).isEqualTo("invalid state");
    }
}