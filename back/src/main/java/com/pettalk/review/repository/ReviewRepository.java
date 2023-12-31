package com.pettalk.review.repository;

import com.pettalk.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByPetSitter_PetSitterId(Long petSitterId);

    Optional<Review> findByWcBoardId(Long wcBoardId);
}
