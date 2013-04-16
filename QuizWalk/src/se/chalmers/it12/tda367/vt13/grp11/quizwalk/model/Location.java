package se.chalmers.it12.tda367.vt13.grp11.quizwalk.model;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Location extends Coordinates {

	private final String description;
	private final Image image;
	
	public Location(int latitude, int longitude, String description, Image image) {
		super(latitude, longitude);
		
		this.description = checkNotNull(description);
		checkArgument(!description.isEmpty(), "Description can't be empty");
		
		this.image = checkNotNull(image);
	}

	public String getDescription() {
		return description;
	}

	/**
	 * @return the image representing this location. <TT>null</TT> if no such image is present.
	 */
	public Image getImage() {
		return image;
	}
	
	

}
