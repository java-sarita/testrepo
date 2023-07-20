package com.vestire.merchant.repository;

import com.vestire.merchant.entity.Merchant;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MerchantRepositoryImpl implements CustomeMerchantRepository{

    private MongoTemplate mongoTemplate;

    public MerchantRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Merchant> getAllMerchant() {
        List<Merchant> list = mongoTemplate.findAll(Merchant.class);
        return list;
    }

    @Override
    public Merchant addMerchant(Merchant merchant) {
        return mongoTemplate.save(merchant);
    }
    @Override
    public Merchant getMerchant(int id){
        return mongoTemplate.findById(id,Merchant.class);
    }
}
