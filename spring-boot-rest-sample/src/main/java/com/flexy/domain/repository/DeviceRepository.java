package com.flexy.domain.repository;

import com.flexy.domain.model.DeviceInfo;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Component;

@Component
public class DeviceRepository extends ResourceRepositoryBase<DeviceInfo, Long> {

    protected DeviceRepository() {
        super(DeviceInfo.class);
    }

    @Override
    public ResourceList<DeviceInfo> findAll(QuerySpec querySpec) {
        throw new UnsupportedOperationException();
    }
}
