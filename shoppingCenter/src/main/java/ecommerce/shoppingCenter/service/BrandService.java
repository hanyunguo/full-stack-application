package ecommerce.shoppingCenter.service;

import ecommerce.shoppingCenter.model.BrandResponse;

import java.util.List;

public interface BrandService {
    List<BrandResponse> getAllBrands();
}