package net.oijon.susquehanna.gui;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;

/**
 * Creates a VBox with the parameters of all Toolboxes
 * @author alex
 *
 */
public class Toolbox extends VBox {
	/**
	 * Creates a Toolbox
	 * @param background The image for the Toolbox, should be named something like {name}-bar.png
	 */
	public Toolbox(Background background) {
		this.setBackground(background);
        this.setPrefWidth(100);
        this.setAlignment(Pos.TOP_CENTER);
	}
	
}
