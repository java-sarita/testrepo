package com.vestire.merchant.repository;

import com.vestire.merchant.entity.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<Merchant,Integer>, CustomeMerchantRepository {

}
