package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ReviewDao;
import com.app.entity.Product;
import com.app.entity.Review;
import com.app.entity.User;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDao reviewDao;

	@Override
	public Review addReview(Review review) {
		return reviewDao.save(review);
	}

	@Override
	public List<Review> fetchProductReviews(List<Product> products) {
		return reviewDao.findByProductIn(products);
	}

	@Override
	public List<Review> fetchSellerProductReview(User seller) {
		return reviewDao.findAllOrdersBySeller(seller);
	}

}
