package com.function;

import com.model.BuildTool;
import com.model.FrontendApp;
import com.model.Architecture;
import com.model.Server;
import com.model.PackageManagement;
import com.model.FrontendScreen;
import com.model.Project;
import com.model.complex.BasicDetails;
import com.model.complex.AdvancedDetails;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.repository.PackageManagementRepository;
import com.repository.ProjectRepository;
import com.repository.ArchitectureRepository;
import com.repository.ServerRepository;
import com.repository.FrontendScreenRepository;
import com.repository.BuildToolRepository;
import com.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
