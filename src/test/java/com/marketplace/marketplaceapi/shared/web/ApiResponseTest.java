package com.marketplace.marketplaceapi.shared.web;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ApiResponseTest {

    @Test
    void ok_shouldReturnSuccessTrue() {
        ApiResponse<String> response = ApiResponse.ok("data");

        assertThat(response.success()).isTrue();
        assertThat(response.message()).isEqualTo("OK");
        assertThat(response.data()).isEqualTo("data");
    }

    @Test
    void error_shouldReturnSuccessFalse() {
        ApiResponse<Void> response = ApiResponse.error("something went wrong");

        assertThat(response.success()).isFalse();
        assertThat(response.message()).isEqualTo("something went wrong");
        assertThat(response.data()).isNull();
    }
}