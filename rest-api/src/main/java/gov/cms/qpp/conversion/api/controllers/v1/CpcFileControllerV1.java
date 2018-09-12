package gov.cms.qpp.conversion.api.controllers.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.cms.qpp.conversion.api.controllers.SkeletalCpcFileController;
import gov.cms.qpp.conversion.api.model.Constants;
import gov.cms.qpp.conversion.api.services.CpcFileService;

/**
 * Controller to handle cpc file data version one
 */
@RestController
@RequestMapping(path = "/", headers = {"Accept=" + Constants.V1_API_ACCEPT})
public class CpcFileControllerV1 extends SkeletalCpcFileController {

	public CpcFileControllerV1(final CpcFileService cpcFileService) {
		super(cpcFileService);
	}
}
