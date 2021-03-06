/*******************************************************************************
 * Copyright (c) 2009 Alexander Koderman <ak[at]sernet[dot]de>.
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 *     This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *     You should have received a copy of the GNU Lesser General Public 
 * License along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Alexander Koderman <ak[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
/*
 * Created on 03.05.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package sernet.hui.common.connect;



public final class PropertyFactory {
    
    private PropertyFactory(){};

    protected static Property create(PropertyType type, String value, Entity ent) {
		Property newProp = new Property(ent);
		newProp.setPropertyType(type.getId());
		newProp.setPropertyValue(value);
		return newProp;   		
    }

    protected static Property create(String propertyType, String propertyValue, Entity ent) {
        Property newProp = new Property(ent);
        newProp.setPropertyType(propertyType);
        newProp.setPropertyValue(propertyValue);
        return newProp;
    }
}
