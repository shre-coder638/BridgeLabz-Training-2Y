package com.ProductReviewSystem;

public class Runner {
	 public static void main(String[] args) {
	        ProductReview review = new ProductReview();

	        try {
	            review.submitReview(6, "Excellent product!");
	        } catch (InvalidRatingException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (EmptyReviewException e) {
	            System.out.println("Warning: " + e.getMessage());
	        }

	        try {
	            review.submitReview(4, "");
	        } catch (InvalidRatingException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (EmptyReviewException e) {
	            System.out.println("Warning: " + e.getMessage());
	        }

	        try {
	            review.submitReview(5, "Worth the price!");
	        } catch (InvalidRatingException | EmptyReviewException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        System.out.println("Review process completed.");
	    }

}
