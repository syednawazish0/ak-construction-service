package com.ak.construction.service.controller;

import com.ak.construction.service.entity.Review;
import com.ak.construction.service.service.ReviewService;
import com.ak.construction.service.util.PaginationUtil;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tech.jhipster.web.util.HeaderUtil;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReview(Pageable pageable) {
        Page<Review> page = reviewService.findAll(pageable);
        HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @PostMapping("/reviews")
    public Review addReview( @RequestBody Review review) throws URISyntaxException {
        return reviewService.save(review);

    }

    @PutMapping("/reviews")
    public Review updateUser( @RequestBody Review review) {
        return reviewService.update(review);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteUserById( @PathVariable("id") long id) {
        reviewService.delete(id);
    }
}
