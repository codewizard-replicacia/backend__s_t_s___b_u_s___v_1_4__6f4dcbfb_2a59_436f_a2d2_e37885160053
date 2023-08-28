package com.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.model.BuildTool;
import com.model.FrontendApp;
import com.model.Architecture;
import com.model.Server;
import com.model.PackageManagement;
import com.model.FrontendScreen;
import com.model.Project;
import com.model.complex.BasicDetails;
import com.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppMetaTags")
@Table(schema = "\"sts-v14\"", name = "\"FrontendAppMetaTags\"")
@Data
public class FrontendAppMetaTags{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"MetaTags\"")
    private Long metaTags;
}