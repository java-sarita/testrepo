package com.vestire.merchant.service;

import com.mongodb.MongoException;
import com.vestire.merchant.controller.MerchantApi;
import com.vestire.merchant.entity.Merchant;
import com.vestire.merchant.exception.MerchantException;
import com.vestire.merchant.model.MerchantDao;
import com.vestire.merchant.repository.MerchantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MerchantService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MerchantService.class);
    private MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public List<Merchant> getAllMerchant() {
        List<Merchant> list = merchantRepository.getAllMerchant();
        /*MerchantDao merchantDao = new MerchantDao(11,"pragati","9989765432","dhamangaon railway");
        MerchantDao merchantDao1 = new MerchantDao(12,"jangda","9989765432","dhamangaon railway");
       // List<MerchantDao> merchantDaoList = new ArrayList<MerchantDao>(new MerchantDao[]{new MerchantDao(11, "pragati", "9989765432", "dhamangaon railway")},{new MerchantDao(11,"pragati","9989765432","dhamangaon railway")});
        List<MerchantDao> merchantDaoList = new ArrayList<MerchantDao>();
        merchantDaoList.add(merchantDao);
        merchantDaoList.add(merchantDao1);*/
        return list;
    }

    public Merchant saveMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    public Merchant getMerchantById(int id) {
        Merchant merchant=merchantRepository.findById(id).orElseThrow(() -> new MerchantException("Merchant not found ", "123000"));
        return merchant;
    }
}
