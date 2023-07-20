package com.vestire.merchant.repository;

import com.vestire.merchant.entity.Merchant;
import com.vestire.merchant.model.MerchantDao;

import java.util.List;

public interface CustomeMerchantRepository {
    List<Merchant> getAllMerchant();
    Merchant addMerchant(Merchant merchant);
    //Merchant getById(int id);

    Merchant getMerchant(int id);

    // Merchant getMerchant(int id);
}
