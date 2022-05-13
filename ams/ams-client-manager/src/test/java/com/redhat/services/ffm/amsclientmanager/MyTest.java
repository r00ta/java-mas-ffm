package com.redhat.services.ffm.amsclientmanager;

import java.time.Duration;

import javax.inject.Inject;

import com.redhat.services.ffm.amsclientmanager.models.AccountInfo;
import com.redhat.services.ffm.amsclientmanager.models.ResourceType;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.groups.UniAwait;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MyTest {

    @Inject
    AccountManagementService accountManagementService;

    @Test
    public void test() throws InterruptedException {
        AccountInfo accountInfo = new AccountInfo("11009103", "user", true, 1L);
//        ResourceType await = accountManagementService.determineAllowedResourceType(accountInfo, "test", "test").await().atMost(Duration.ofSeconds(10));
//        System.out.println(await);
        Thread.sleep(10000);
    }
}
