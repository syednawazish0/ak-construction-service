package com.ak.construction.service.service.Impl;

import com.ak.construction.service.entity.Review;
import com.ak.construction.service.repository.ReviewRepository;
import com.ak.construction.service.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review update(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Page<Review> findAll(Pageable pageable) {
        return reviewRepository.findAll(pageable);
    }

    @Override
    public Optional<Review> findOne(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }
}
