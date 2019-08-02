package com.flydean.beans;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wayne
 * @version DefaultUsageTracked,  2019-08-02 22:40
 */

@Slf4j
public class DefaultUsageTracked implements UsageTracked{
    @Override
    public void incrementUseCount() {
        log.info("incrementUseCount");
    }
}
