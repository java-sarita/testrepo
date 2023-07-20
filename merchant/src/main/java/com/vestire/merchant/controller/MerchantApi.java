package com.vestire.merchant.controller;

import com.vestire.merchant.entity.Merchant;
import com.vestire.merchant.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/merchant/")
public class MerchantApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(MerchantApi.class);
    private MerchantService merchantService;

    public MerchantApi(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Merchant>> getAllMerchant() {
        LOGGER.info("Inside getAllMerchant api");
        List<Merchant> merchantList = merchantService.getAllMerchant();
        if (merchantList != null) {
            return ResponseEntity.ok(merchantList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Merchant createMerchant(@RequestBody Merchant merchant) {
        LOGGER.info("Inside create Merchant api requestBody={}", merchant);
        return merchantService.saveMerchant(merchant);
    }

    @GetMapping(value = "/getMerchantById/{merchantId}")
    public Merchant getMErchantById(@PathVariable int merchantId) {
        LOGGER.info("Inside get Merchant by id api merchantId={}", merchantId);
        return merchantService.getMerchantById(merchantId);
    }
}
