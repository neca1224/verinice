/*******************************************************************************
 * Copyright (c) 2017 Benjamin Weißenfels.
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
 *     @author Benjamin Weißenfels <bw[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.web.poseidon.view.menu.menuitem;

import org.primefaces.model.menu.DefaultMenuItem;

/**
 *
 * @author Benjamin Weißenfels <bw[at]sernet[dot]de>
 *
 */
public class IsoObjectsMenuItem extends DefaultMenuItem {

    private static final String TITLE = "ISO Objects";

    private static final String URL = "/edit/iso-editor.xhtml";

    private static final String ICON = "fa fa-fw fa-file";

    private static final long serialVersionUID = 1L;

    public IsoObjectsMenuItem() {
        super(TITLE);
        super.setIcon(ICON);
        super.setUrl(URL);
    }
}
