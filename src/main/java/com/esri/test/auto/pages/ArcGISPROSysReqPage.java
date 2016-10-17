package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Arc Map System Requirements Page from ArcGIS Desktop System Requirement Page thorough Link.
 * @author balajih
 *
 */
public class ArcGISPROSysReqPage extends ESRIWrappers{
	
	public ArcGISPROSysReqPage() throws Throwable{
		if(!VerifyTitle("ArcGIS Pro 1.3 system requirements—ArcGIS Pro | ArcGIS for Desktop"));
		Reporter.reportStep("This is not the ArcGIS Pro 1.3 Page", "FAIL");
	}
	//Click Browser Back button to Navigate back to the Previous Screen
			public ArcGISforDesktopSysRePage clickBrowBackButton() throws Throwable{
				clickBrowserBackButton();
				return new ArcGISforDesktopSysRePage() ;
			}

}
