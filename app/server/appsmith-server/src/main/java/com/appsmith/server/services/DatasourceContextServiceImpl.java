package com.appsmith.server.services;

import com.appsmith.server.helpers.PluginExecutorHelper;
import com.appsmith.server.services.ce.DatasourceContextServiceCEImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DatasourceContextServiceImpl extends DatasourceContextServiceCEImpl implements DatasourceContextService {

    public DatasourceContextServiceImpl(DatasourceService datasourceService,
                                        PluginService pluginService,
                                        PluginExecutorHelper pluginExecutorHelper,
                                        ConfigService configService) {

        super(datasourceService, pluginService, pluginExecutorHelper, configService);
    }
}
