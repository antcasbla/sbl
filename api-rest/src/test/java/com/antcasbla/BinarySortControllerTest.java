package com.antcasbla;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BinarySortControllerTest {


    @InjectMocks
    private BinarySortController binarySortController;

    @Test
    public void testSortByBinaryRepresentation_Success() {
        // Arrange
        List<Integer> input = Arrays.asList(7, 2, 1, 9, 5, 3, 8, 25, 42);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 8, 3, 5, 9, 7, 25, 42);

        // Act
        ResponseEntity<List<Integer>> result = binarySortController.sortByBinaryRepresentation(input);

        // Assert
        assertEquals(expectedOutput, result.getBody());
    }

    @Test
    public void testSortByBinaryRepresentation_EmptyList() {
        // Arrange
        List<Integer> input = Arrays.asList();

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            binarySortController.sortByBinaryRepresentation(input);
        });

        assertEquals("Input list cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testSortByBinaryRepresentation_NullInput() {
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            binarySortController.sortByBinaryRepresentation(null);
        });

        assertEquals("Input list cannot be null or empty", exception.getMessage());
    }
}
