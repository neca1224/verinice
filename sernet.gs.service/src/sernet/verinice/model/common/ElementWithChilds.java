/*******************************************************************************
 * Copyright (c) 2017 Daniel Murygin <dm{a}sernet{dot}de>.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     Daniel Murygin <dm{a}sernet{dot}de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.model.common;

import java.util.Arrays;

/**
 *
 *
 * @author Daniel Murygin <dm{a}sernet{dot}de>
 */
public abstract class ElementWithChilds extends CnATreeElement {
    
    protected ElementWithChilds() {
        super();
    }
    
    protected ElementWithChilds(CnATreeElement parent) {
        super(parent);
    }

    /* (non-Javadoc)
     * @see sernet.gs.ui.rcp.main.common.model.CnATreeElement#canContain(java.lang.Object)
     */
    @Override
    public boolean canContain(Object obj) {
        boolean canContain = false;
        if(obj instanceof CnATreeElement) {
            CnATreeElement element = (CnATreeElement)obj;
            canContain = Arrays.asList(getChildTypes()).contains(element.getTypeId());
        }
        return canContain;
    }
    
    public abstract String[] getChildTypes();

}
