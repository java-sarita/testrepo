package com.vestire.merchant;

import com.vestire.merchant.entity.Merchant;
import com.vestire.merchant.repository.MerchantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MerchantServiceTest {
    @Autowired
    private MerchantRepository merchantRepository;
    @Test
    public void testGetAllMerchant(){
        List<Merchant> merchant = merchantRepository.getAllMerchant();
        assertNotNull(merchant);
    }


}
