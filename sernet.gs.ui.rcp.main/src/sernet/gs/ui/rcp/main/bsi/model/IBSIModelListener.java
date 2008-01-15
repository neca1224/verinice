package sernet.gs.ui.rcp.main.bsi.model;

import sernet.gs.ui.rcp.main.common.model.CnATreeElement;


public interface IBSIModelListener {

	void childAdded(CnATreeElement category, CnATreeElement child);

	void childRemoved(CnATreeElement category, CnATreeElement child);

	void childChanged(CnATreeElement category, CnATreeElement child);
	
	void modelRefresh();
	

}
