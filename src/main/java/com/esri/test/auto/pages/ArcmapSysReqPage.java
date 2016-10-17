package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Arc Map System Requirements Page from ArcGIS Desktop System Requirement Page thorough Link.
 * @author balajih
 *
 */
public class ArcmapSysReqPage extends ESRIWrappers{
	
	public ArcmapSysReqPage() throws Throwable{
		if(!VerifyTitle("ArcGIS 10.4.x for Desktop system requirements—ArcGIS Help | ArcGIS for Desktop"));
		Reporter.reportStep("This is not the ArcGIS 10.4.x Page", "FAIL");
	}

	//Click Browser Back button to Navigate back to the Previous Screen
		public ArcGISforDesktopSysRePage clickBrowBackButton() throws Throwable{
			clickBrowserBackButton();
			return new ArcGISforDesktopSysRePage() ;
		}
}
