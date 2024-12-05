package com.antcasbla;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/sort")
class BinarySortController {

    @PostMapping("/binary")
    public ResponseEntity<List<Integer>> sortByBinaryRepresentation(@RequestBody List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Input list cannot be null or empty");
        }

        numbers.sort((a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA == countB) {
                return Integer.compare(a, b);
            }
            return Integer.compare(countA, countB);
        });

        return ResponseEntity.ok(numbers);
    }
}
