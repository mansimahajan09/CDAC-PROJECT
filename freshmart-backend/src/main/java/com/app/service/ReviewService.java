package com.app.service;

import java.util.List;

import com.app.entity.Product;
import com.app.entity.Review;
import com.app.entity.User;

public interface ReviewService {
	
	Review addReview(Review review);
	
	List<Review> fetchProductReviews(List<Product> products);

	List<Review> fetchSellerProductReview(User seller);
	
}
