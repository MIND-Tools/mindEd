package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;


/**
* Class for the customization of CFileFigure
* Extends CShape to draw an image
*
* @author AVE
* @date 20/08/2009
* @Version 
* **/

public class FileCFigure extends CShape implements IFractalShape {
	
	public FileCFigure(){
		super();
	}
	
	/**
	 * Calls the CShape method to fill the shape with an image
	 * @author AVER
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		//Call the method to draw an image
		//instead of the basic call
		super.fillShape(graphics, FILEC_IMAGE_NAME); 
	}
	
	//Taille par d�faut de l'image
	protected static Dimension PREFERRED_SIZE = new Dimension (50,50);
	
}