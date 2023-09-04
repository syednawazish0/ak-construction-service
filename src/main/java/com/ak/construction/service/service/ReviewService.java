package com.ak.construction.service.service;

import com.ak.construction.service.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ReviewService {


    Review save(Review cityDTO);

    Review update(Review cityDTO);

    Page<Review> findAll(Pageable pageable);

    Optional<Review> findOne(Long id);

    void delete(Long id);
}
