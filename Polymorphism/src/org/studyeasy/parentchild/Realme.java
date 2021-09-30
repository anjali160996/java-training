package org.studyeasy.parentchild;

public class Realme extends Phone{
	
	private String camera;

	public Realme() {
		// super("XX", "YY");
		super("XX");
	}
	
	public Realme(String a, String b) {
		super(a, b);
	}
	
	public Realme(String cameraParam, String modelParam, String mfdParam) {
		super(modelParam, mfdParam);
		this.camera = cameraParam;
	}
	
	public String getCamera() {
		return camera;
	}
	
}
