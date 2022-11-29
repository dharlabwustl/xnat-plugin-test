/*
 * xnat-testatul: org.nrg.xnat.testatul.plugin.TestatulXnatPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.testatul.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.TestatulBiosamplecollectionBean;
import org.nrg.xdat.bean.RadRadiologyreaddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "testatulPlugin", name = "XNAT 1.7 Testatul 2016 Plugin", entityPackages = "org.nrg.xnat.testatul.entities",
            dataModels = {@XnatDataModel(value = TestatulBiosamplecollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Biosample Collection",
                                         plural = "Biosample Collections"),
                          @XnatDataModel(value = RadRadiologyreaddataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Radiology Read",
                                         plural = "Radiology Reads")})
@ComponentScan({"org.nrg.xnat.testatul.subjectmapping.preferences",
        "org.nrg.xnat.testatul.subjectmapping.repositories",
        "org.nrg.xnat.testatul.subjectmapping.rest",
        "org.nrg.xnat.testatul.subjectmapping.services.impl"})
public class TestatulXnatPlugin {
    @Bean
    public String testatulPluginMessage() {
        return "Hello there from the testatul plugin!";
    }
}
